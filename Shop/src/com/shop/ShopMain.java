package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

/*
 * 	날짜 : 2023/07/13
 * 	내용 : CRUD 실습
 */
public class ShopMain {
	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ProductDAO productDAO = ProductDAO.getInstance();
		
		CustomerVO loginedCustomer = null;
		
		while(true) {
			
			if(loginedCustomer == null) {
				System.out.println("종료: 0, 로그인: 1, 회원가입: 2, 상품목록: 3, 구매하기: 4");

			}else {
				System.out.println("종료: 0, 로그아웃: 1, 주문현황: 2, 상품목록: 3, 구매하기: 4");

			}
			
			System.out.print("선택 : ");
			int answer = sc.nextInt();
			
			if (answer == 0) {
				// 종료
				break;
			
			}else if(answer == 1) {
				
				//로그인
				if (loginedCustomer == null) {
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginedCustomer = customerDAO.selectCustomer(custId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				
				}else {
					// 로그아웃
					System.out.println(loginedCustomer.getName() + "님 안녕히가세요.");
					loginedCustomer = null;
				}
				
				
			}else if(answer == 2) {
				if(loginedCustomer == null) {
					
					// 회원가입
					
					CustomerVO vo = new CustomerVO();
					
					System.out.print("아이디 입력 : ");
					vo.setCustId(sc.next());
					
					System.out.print("이름 입력 : ");
					vo.setName(sc.next());
					
					System.out.print("휴대폰 입력 : ");
					vo.setHp(sc.next());
					
					System.out.print("주소 입력 : ");
					vo.setAddr(sc.next());
					
					
					int result = customerDAO.insertCustomer(vo);
					
					if(result > 0) {
						
						System.out.println("회원가입을 축하합니다.");
						
					}else {
						
						System.out.println("회원가입에 실패 했습니다. 다시 시도하세요.");
						
					}
				}else {
					//	주문현황
					String orderId = loginedCustomer.getCustId();
					List<OrderVO> myOrders = orderDAO.selectOrders(orderId);
					
					for(OrderVO myOrder : myOrders) {
						System.out.println(myOrder);
					}
					
				}
				
				
			}else if(answer == 3) {
				//	상품목록
				List<ProductVO> products = productDAO.selectProducts();
				
				System.out.println("---------- 상품목록 조회 ----------");
				for(ProductVO product : products) {
					System.out.println(product);
				}
				System.out.println("------------ 조회 완료 ------------");
				
			}else if(answer == 4) {
				//	주문하기
				
				if(loginedCustomer == null) {
					System.out.println("로그인을 먼저 하세요");
					continue;
				}
				
				System.out.print("주문할 상품 번호를 입력: ");
				int proNo = sc.nextInt();
				
				
				System.out.print("주문할 수량 입력: ");
				int prodCount = sc.nextInt();

				//	주문객체 생성
				OrderVO orderVo = new OrderVO();
				orderVo.setOrdeId(loginedCustomer.getCustId());
				orderVo.setOrderProduct(proNo);
				orderVo.setOrderCount(prodCount);
				
				
				//	주문처리
				int result = orderDAO.insertOrder(orderVo);
				
				// 상품 재고 Update
				productDAO.updateProductStock(proNo, prodCount);
				
				
				
				if(result > 0) {
					System.out.println("상품주문완료");
				}else {
					System.out.println("상품주문실패");
				}

			}
		
		}
		
		sc.close();
		System.out.println("안녕히 가세요~");
		
	}	// Main end
}
