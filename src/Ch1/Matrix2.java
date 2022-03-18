package Ch1;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("2221년, 인공지능이 인간으로부터 독립하고 인간은 기계와의 전쟁에서 패배한다" + " 이후 기계는 인간의 뇌 속에 2021년의 세상을 프로그래밍한다" + "\n낮에는 평범한 직장인으로 일하지만, 밤에는 '네오'라는 아이디로 해킹을 저지르는 앤더슨에게 모피어스에게 연락이 온다");
        System.out.println("모피어스는 '그'를 찾는 중이라며 네오에게 계속 잠들어 있을 것인지? 깨어날 것인지? 결정하라고 한다.");
        System.out.println("빨간약과 파란약 중 원하는 약을 삼키시오");
        System.out.println("1.빨간약" + " 2.파란약");
        num = scan.nextInt();

        if (num == 2) {
            System.out.println("알람이 울리고 시계는 7:00을 가리킨다" + "\n출근 수단을 선택하시오");
            System.out.println("1.지옥철" + " 2.지옥버스" + " 3.따릉이");
            num = scan.nextInt();
            if (num == 1 || num == 2) {
                System.out.println("오늘 중요한 회의에 늦지 말라는 부장님의 전화를 받고 아침부터 머릿속이 복잡해진다");
                System.out.println("1.네이버 증권소식을 본다" + "\n2.YOUTUBE를 본다");
                num = scan.nextInt();
                if (num == 1) {
                    System.out.println("오늘 HEADLINE 뉴스" + "\n코스피, 동학개미 매도에 3100돌파!  두나무 업비트, 가상화폐 사업자 첫 신고 접수..관련주 일제히 급등세" + "\n바닥모를 중국증시..바닥 없는 추락에 눈덩이 손실..거래소, 불공정거래 신고건수 118%증가");
                    System.out.println("LG화학, GM전기차 리콜 충격에 급락" + "삼성전자, SK하이닉스 외국인 지분 최저");
                    System.out.println("1.파란색 비가 내리는 주식어플을 삭제한다" + " 2.부장님 전화를 받는다" + " 3.환승준비를 한다");
                    num = scan.nextInt();
                    if (num == 1) {
                        System.out.println("현재 시각 8시 30분, 회의 준비로 다들 바쁘게 정리 중이다");
                        System.out.println("1.회의자료를 점검한다" + " 2.주변 정리를 함께 돕는다" + " 3.급히 온 카톡을 확인한다");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("회의를 마치고 자리로 돌아와 이메일을 확인하고 밀린 업무부터 처리한다" + "\n현재 시각 11시 30분, 부장이 점심메뉴를 고르라고 한다..고민하면 뭐하겠는가 어차피 부장님 원하시는 곳으로 갈텐데..");
                            System.out.println("그럼에 불구하고 항상 그래왔듯이 부장님 입맛에 맞춰 4가지의 선택지를 준비한다");
                            System.out.println("1.이모네 식당" + " 2.만리장성" + " 3.엄마표 순두부" + " 4.나는 철판왕");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("8000원짜리 식사를 마치고 복귀 중 부장님이 커피사다리를 제안한다..하필이면 스타벅스다" + "\n인원은 총 10명.. 만약 걸리면 이번 주 데이트는 없다" + "\n사다리를 선택하시오");
                                System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("그렇다..예상한 그대로다 이번 주 데이트는 없다" + "\n현재 시각 1시 씁쓸한 마음을 뒤로하고 자리에 앉아 업무에 집중한다" + "\n현재 시각 2시 15분, 부장님이 급하게 자리로 호출한다\" + \" 무엇이 잘못되었는지 곰곰이 되짚어본다");
                                    System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                        System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("그렇다..예상한 그대로다 이번 주 데이트는 없다" + "\n현재 시각 1시 씁쓸한 마음을 뒤로하고 자리에 앉아 업무에 집중한다" + "\n현재 시각 2시 15분, 부장님이 급하게 자리로 호출한다\" + \" 무엇이 잘못되었는지 곰곰이 되짚어본다");
                                    System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("8000원짜리 식사를 마치고 복귀 중 부장님이 커피사다리를 제안한다..하필이면 스타벅스다" + "\n인원은 총 10명.. 만약 걸리면 이번 주 데이트는 없다" + "\n사다리를 선택하시오");
                                System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("그렇다..예상한 그대로다 이번 주 데이트는 없다" + "\n현재 시각 1시 씁쓸한 마음을 뒤로하고 자리에 앉아 업무에 집중한다" + "\n현재 시각 2시 15분, 부장님이 급하게 자리로 호출한다\" + \" 무엇이 잘못되었는지 곰곰이 되짚어본다");
                                    System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("그렇다..예상한 그대로다 이번 주 데이트는 없다" + "\n현재 시각 1시 씁쓸한 마음을 뒤로하고 자리에 앉아 업무에 집중한다" + "\n현재 시각 2시 15분, 부장님이 급하게 자리로 호출한다\" + \" 무엇이 잘못되었는지 곰곰이 되짚어본다");
                                    System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("신나게 깨지고 우울해진 뒷모습을 보고 옆자리 대리님이 옥상으로 부르신다" + "\n옥상에서 미생 찍고 내려와 오늘 업무일지를 작성하고 조만간 있을 출장준비를 한다" + "\n무엇을 먼저 준비할까요?");
                                        System.out.println("1.교통편" + " 2.숙박시설" + " 3.관련서류" + " 4.관련샘플");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 더 할 일도 없는데..아무도 자리에서 일어나지 않는다" + "\n나의 선택은?");
                                            System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("줄줄이 이어선 퇴근길 인파 속에 파묻혀 빌딩 사이로 비치는 석양을 바라본다" + " 왠지 마음이 평온해진다" + "\n퇴근수단을 정하시오");
                                                System.out.println("1.따릉이" + " 2.지옥철" + " 3.지옥버스");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시30분, 친구와의 약속을 위해 신논현역으로 이동한다" + "\n저녁 메뉴를 고르시오");
                                                    System.out.println("1.오픈 양대창" + " 2.유림상회" + " 3.도셰프" + " 4.하루스시");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 10시, 친구와 헤어지고 집으로 귀가한다" + "\n집으로 도착 후 오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                        System.out.println("1.아시아나항공" + " 2.크래프톤" + " 3.삼성전자" + " 4.LG디스플레이");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, 잠들기 전 괜시리 기분이 좋아진다" + "\n그렇다.. 내일은 월급날이기 때문이다" + "\n월급으로 구매할 물품을 고르시오");
                                                            System.out.println("1. 커피머신" + " 2. UNIX 헤어드라이기" + " 3. 다이슨 청소기 4. LG Gram");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("적막감이 감도는 회의실..상무님이 부장님들을 호통치기 시작한다" + "\n부장님이 상무님에게 털리기 시작한다" + "\n나의 선택은?");
                            System.out.println("1.부장님께 정리된 자료를 건넨다" + " 2.부장님께 망치를 쥐어준다" + " 3.화장실로 도망친다" + " 4.멍 때린다");
                            num = scan.nextInt();
                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                System.out.println("현재 시각 10시, 긴 회의 끝에 차장님이 급하게 출장준비를 하라신다" + "\n무엇을 준비할 것인가?");
                                System.out.println("1.관련샘플" + " 2.정관장 홍삼세트" + " 3.페브리즈" + " 4.밀크시슬");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 11시, 고객사로 향하던 중 휴게소에 잠시 들린다" + "\n점심메뉴를 고르시오");
                                    System.out.println("1.양푼이비빔밥" + " 2.애플수제등심돈가스" + " 3.옛날한우국밥" + " 4.흑돼지김치찌개");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 12시, 졸음이 슬슬 오기 시작한다" + "\n이미 옆에 있는 차장님은 졸고 계신다" + "\n속도를 높여야겠다 몇 km/h로 달릴 것인가?");
                                        System.out.println("1. 140km/h" + " 2.150km/h" + " 3.160km/h" + " 4.170km/h");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시, 업무일지 작성을 마치고 서류정리를 하는 중이다" + "\n서둘러 마치면 오늘은 칼퇴가 가능할 것만 같다");
                                                System.out.println("잠시 오늘의 증시를 잠깐 살펴본다" + " 오늘의 KOSPI는?");
                                                System.out.println("1.3133.23" + " 2.3139.24" + " 3.3091.70" + " 4.3055.53");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시, 업무일지 작성을 마치고 서류정리를 하는 중이다" + "\n서둘러 마치면 오늘은 칼퇴가 가능할 것만 같다");
                                                System.out.println("잠시 오늘의 증시를 잠깐 살펴본다" + " 오늘의 KOSPI는?");
                                                System.out.println("1.3133.23" + " 2.3139.24" + " 3.3091.70" + " 4.3055.53");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시, 업무일지 작성을 마치고 서류정리를 하는 중이다" + "\n서둘러 마치면 오늘은 칼퇴가 가능할 것만 같다");
                                                System.out.println("잠시 오늘의 증시를 잠깐 살펴본다" + " 오늘의 KOSPI는?");
                                                System.out.println("1.3133.23" + " 2.3139.24" + " 3.3091.70" + " 4.3055.53");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시, 업무일지 작성을 마치고 서류정리를 하는 중이다" + "\n서둘러 마치면 오늘은 칼퇴가 가능할 것만 같다");
                                                System.out.println("잠시 오늘의 증시를 잠깐 살펴본다" + " 오늘의 KOSPI는?");
                                                System.out.println("1.3133.23" + " 2.3139.24" + " 3.3091.70" + " 4.3055.53");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                    System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                        System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                            System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("집에 들어가기 전 스터디 카페를 들려 다가올 사내TEST를 준비한다" + "\n무엇을 먼저 공부할 것인가?");
                                                                System.out.println("1.무역영어" + " 2.HSK" + " 3.품질관리" + " 4.데이터마이닝");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                                    System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                                    num = scan.nextInt();
                                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                                        System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                                        System.out.println("무엇을 볼 것인가?");
                                                                        System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                                        num = scan.nextInt();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 12시, 졸음이 슬슬 오기 시작한다" + "\n이미 옆에 있는 차장님은 졸고 계신다" + "\n속도를 높여야겠다 몇 km/h로 달릴 것인가?");
                                        System.out.println("1. 140km/h" + " 2.150km/h" + " 3.160km/h" + " 4.170km/h");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 7시, SUBWAY에 들려 저녁식사 메뉴를 고른다");
                                                    System.out.println("1.로스트 치킨" + " 2.써브웨이 클럽" + " 3.로스트 비프" + " 4.베지");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 11시, 고객사로 향하던 중 휴게소에 잠시 들린다" + "\n점심메뉴를 고르시오");
                                    System.out.println("1.양푼이비빔밥" + " 2.애플수제등심돈가스" + " 3.옛날한우국밥" + " 4.흑돼지김치찌개");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 12시, 졸음이 슬슬 오기 시작한다" + "\n이미 옆에 있는 차장님은 졸고 계신다" + "\n속도를 높여야겠다 몇 km/h로 달릴 것인가?");
                                        System.out.println("1. 140km/h" + " 2.150km/h" + " 3.160km/h" + " 4.170km/h");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 12시, 졸음이 슬슬 오기 시작한다" + "\n이미 옆에 있는 차장님은 졸고 계신다" + "\n속도를 높여야겠다 몇 km/h로 달릴 것인가?");
                                        System.out.println("1. 140km/h" + " 2.150km/h" + " 3.160km/h" + " 4.170km/h");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 4시, 생각보다 협상이 길어졌다" + "\n노발대발 중인 고객사에 챙겨온 홍삼세트를 건네며 굽신거린다");
                                            System.out.println("회사로 다시 복귀 중 비가 세차게 내리기 시작한다" + " 아무래도 속도를 줄여야할 것 같다");
                                            System.out.println("1.70km/h" + " 2.80km/h" + " 3.85km/h" + " 4.90km/h");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 6시, 부장님이 갑자기 회식약속을 잡으셨다" + "\n나의 선택은?");
                                                System.out.println("1.칼퇴한다" + " 2.아픈 척한다" + " 3.못 들은 척한다" + " 4.가방 속 망치를 꺼낸다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("퇴근 길 회사 저 멀리 플랜카드가 눈에 들어온다");
                                                    System.out.println("1.하면 된다" + " 2.퇴사말고 노조하세요" + " 3.경쟁력" + " 4.품질은 생명이다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("현재 시각 11시, 갈증이 나서 냉장고를 열어본다" + "\n무엇을 마실 것인가?");
                                                        System.out.println("1.버드와이저" + " 2.물" + " 3.홍초" + " 4.매실");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("현재 시각 12시, YOUTUBE를 킨다");
                                                            System.out.println("무엇을 볼 것인가?");
                                                            System.out.println("1.삼프로TV" + " 2.슈카월드" + " 3.신사임당" + " 4.부동산읽어주는남자");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("구독 중인 YOUTUBE 중에 보고 싶은 채널을 고르시오");
                    System.out.println("1.슈카월드" + " 2.부동산 읽어주는 남자" + " 3.신사임당" + " 4.삼프로TV");
                    num = scan.nextInt();
                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                        System.out.println("하반기 경제 전망");
                        System.out.println("글로벌 경제는 경기 회복에 따른 재정지출 감소로 성장률 상승세 둔화가 예상된다" + "\nG20 국가들의 전년 대비 경제 성장률은 5% 이상을 기록할 것으로 예상되고, 민간소비와 투자의 순차적 회복 가능성도 높아 보인다");
                        System.out.println("미국 10년물 국채금리가 시장 우려처럼 하반기에 크게 오를 것 같지 않다" + "\n내리실 정거장을 고르시오");
                        System.out.println("1.강남역" + " 2.신논현역" + " 3.서초문화예술회관" + " 4.봇들마을5단지");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("현재 시각 10시, 한가해진 틈을 타서 탕비실을 털어보자");
                            System.out.println("1. 바나나" + " 2. 스콘" + " 3. 크리스피 도넛" + " 4. 밀감");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("현재 시각 11시, 품질 A팀이 어수선하다" + " 고객사와 문제가 있는 줄 알았지만.." + "\n회사 비상경영체제에 따른 옆팀 사람들 줄줄이 회사를 떠나간다");
                                System.out.println("심란한 분위기에 휩쓸려 나도 살 길을 준비한다");
                                System.out.println("1.링크드인 등록" + " 2.친구회사 연락" + " 3.경력기술서 작성" + " 4.추천서 준비");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("점심시간이다. 잘 먹어야 열심히 일하지 않겠는가? 우린 S급 노예니까" + "\n구내식당 메뉴를 고르시오");
                                    System.out.println("1.뚝배기 제육덮밥" + " 2.불고기 야끼소바" + " 3.뼈없는 닭갈비" + " 4.김치손수제비");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("점심시간이다. 잘 먹어야 열심히 일하지 않겠는가? 우린 S급 노예니까" + "\n구내식당 메뉴를 고르시오");
                                    System.out.println("1.뚝배기 제육덮밥" + " 2.불고기 야끼소바" + " 3.뼈없는 닭갈비" + " 4.김치손수제비");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("현재 시각 11시, 품질 A팀이 어수선하다" + " 고객사와 문제가 있는 줄 알았지만.." + "\n회사 비상경영체제에 따른 옆팀 사람들 줄줄이 회사를 떠나간다");
                                System.out.println("심란한 분위기에 휩쓸려 나도 살 길을 준비한다");
                                System.out.println("1.링크드인 등록" + " 2.친구회사 연락" + " 3.경력기술서 작성" + " 4.추천서 준비");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("점심시간이다. 잘 먹어야 열심히 일하지 않겠는가? 우린 S급 노예니까" + "\n구내식당 메뉴를 고르시오");
                                    System.out.println("1.뚝배기 제육덮밥" + " 2.불고기 야끼소바" + " 3.뼈없는 닭갈비" + " 4.김치손수제비");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("점심시간이다. 잘 먹어야 열심히 일하지 않겠는가? 우린 S급 노예니까" + "\n구내식당 메뉴를 고르시오");
                                    System.out.println("1.뚝배기 제육덮밥" + " 2.불고기 야끼소바" + " 3.뼈없는 닭갈비" + " 4.김치손수제비");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 12시 40분, 출장 준비를 미리 마치고 차장님을 기다리는 중이다" + "\n차장님께 드릴 커피를 준비한다" + "\n어느 카페로 가시겠습니까?");
                                        System.out.println("1.빽다방" + " 2.이디야" + " 3.스타벅스" + " 4.카페베네");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                            System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                                System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                                    System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                                    System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                        System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("현재 시각 10시, 한가해진 틈을 타서 탕비실을 털어보자");
                            System.out.println("1. 바나나" + " 2. 스콘" + " 3. 크리스피 도넛" + " 4. 밀감");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("점심시간이다. 잘 먹어야 열심히 일하지 않겠는가? 우린 S급 노예니까" + "\n구내식당 메뉴를 고르시오");
                                System.out.println("1.뚝배기 제육덮밥" + " 2.불고기 야끼소바" + " 3.뼈없는 닭갈비" + " 4.김치손수제비");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                    System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                    System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("점심시간이다. 잘 먹어야 열심히 일하지 않겠는가? 우린 S급 노예니까" + "\n구내식당 메뉴를 고르시오");
                                System.out.println("1.뚝배기 제육덮밥" + " 2.불고기 야끼소바" + " 3.뼈없는 닭갈비" + " 4.김치손수제비");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                    System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시, 차장님이 도착하고 고객사로 출발한다" + "\n적막한 분위기를 깨고자 노래를 선곡한다");
                                    System.out.println("1.야생화" + " 2.그날처럼" + " 3.기억의 빈자리" + " 4.내가 너의 곁에");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("오늘의 회식장소 선정..역시 내 담당이다" + "\n취향이 어딨는가? 항상 가던 그곳들 중 선정해야겠다");
                                        System.out.println("1.육전식당" + " 2.대우부대찌개" + " 3.묵전" + " 4.고갯마루집");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("현재 시각 10시 30분, 집으로 돌아오니 아무것도 하기 싫어진다" + "\n내일 또 출근이라는 사실에 절망하지만 하계휴가를 기대하며 스스로 버텨본다");
                                            System.out.println("아무 생각 없이 TV를 틀어본다" + " 무엇을 시청하시겠습니까?");
                                            System.out.println("1. 경제" + " 2. 다큐" + " 3. 예능" + " 4. 스포츠");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 11시 30분, 미국 주식시장이 개장하고 손가락이 분주해진다" + "\n매수할 종목을 고르시오");
                                                System.out.println("1.NVIDIA" + " 2.UNITY" + " 3.로블록스" + " 4.페이스북");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("따릉이를 타고 출근하던 중 자전거에 펑크가 난다");
                System.out.println("오늘 아침부터 일진이 좋지 않다" + " 지각할 것 같아 바로 택시를 탄다" + "\n현재 시각 8시 40분, 이대론 지각이다 서둘러 결정을 해야 한다");
                System.out.println("1.요금결제 후 회사까지 전력질주" + " 2.핑계거리를 찾는다" + " 3.회사까지 택시를 탄다");
                num = scan.nextInt();
                if (num == 1) {
                    System.out.println("현재 시각 8시 57분, 하마터먼 지각할 뻔 했다" + "\n부장님이 A동 회의실에 자료준비를 미리 해놓으라고 요청하신다" + "\n무엇을 먼저 챙길 것인가?");
                    System.out.println("1.기획안" + " 2.관련장비" + " 3.부장님 비타민" + " 4.아이패드");
                    num = scan.nextInt();
                    if (num == 1) {
                        System.out.println("현재 시각 10시 30분, 장시간 회의로 인해 경영팀, 품질팀 서로 간에 언성이 높아지기 시작한다" + "\n부장님이 말빨에서 밀리기 시작한다" + "\n나의 선택은?");
                        System.out.println("1.쌓아뒀던 경영팀의 문제를 꺼낸다" + " 2.부장님께 정리된 자료를 건넨다" + " 3.부장님께 망치를 건넨다" + " 4.화장실로 핑계로 자리를 피한다");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("현재 시각 11시, 회의를 마치고 자리로 복귀해 밀린 업무를 빠르게 처리한다" + "\n오늘도 어김없이 전세계 고객사에서 온갖 자료와 욕설이 날아온다" + " 아무리 봐도 무엇이 잘못되었는지 모르겠다");
                            System.out.println("나는 무엇을 할 것인가?");
                            System.out.println("1.현장을 내려가본다" + " 2.대리님께 물어본다" + " 3.자료를 다시 한 번 꼼꼼히 살핀다" + " 4.수신차단");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                        System.out.println("Good night~");
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                        if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                            System.out.println("Good Night~");
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("현재 시각 11시, 회의를 마치고 자리로 복귀해 밀린 업무를 빠르게 처리한다" + "\n오늘도 어김없이 전세계 고객사에서 온갖 자료와 욕설이 날아온다" + " 아무리 봐도 무엇이 잘못되었는지 모르겠다");
                            System.out.println("나는 무엇을 할 것인가?");
                            System.out.println("1.현장을 내려가본다" + " 2.대리님께 물어본다" + " 3.자료를 다시 한 번 꼼꼼히 살핀다" + " 4.수신차단");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                                    System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                                    num = scan.nextInt();
                                                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                        System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                        System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("현재 시각 10시 30분, 장시간 회의로 인해 경영팀, 품질팀 서로 간에 언성이 높아지기 시작한다" + "\n부장님이 말빨에서 밀리기 시작한다" + "\n나의 선택은?");
                        System.out.println("1.쌓아뒀던 경영팀의 문제를 꺼낸다" + " 2.부장님께 정리된 자료를 건넨다" + " 3.부장님께 망치를 건넨다" + " 4.화장실로 핑계로 자리를 피한다");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("현재 시각 11시, 회의를 마치고 자리로 복귀해 밀린 업무를 빠르게 처리한다" + "\n오늘도 어김없이 전세계 고객사에서 온갖 자료와 욕설이 날아온다" + " 아무리 봐도 무엇이 잘못되었는지 모르겠다");
                            System.out.println("나는 무엇을 할 것인가?");
                            System.out.println("1.현장을 내려가본다" + " 2.대리님께 물어본다" + " 3.자료를 다시 한 번 꼼꼼히 살핀다" + " 4.수신차단");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("현재 시각 11시, 회의를 마치고 자리로 복귀해 밀린 업무를 빠르게 처리한다" + "\n오늘도 어김없이 전세계 고객사에서 온갖 자료와 욕설이 날아온다" + " 아무리 봐도 무엇이 잘못되었는지 모르겠다");
                            System.out.println("나는 무엇을 할 것인가?");
                            System.out.println("1.현장을 내려가본다" + " 2.대리님께 물어본다" + " 3.자료를 다시 한 번 꼼꼼히 살핀다" + " 4.수신차단");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                    System.out.println("사다리 번호를 고르시오");
                                    System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                        System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("집에 도착하니 강아지가 꼬리치며 반겨준다" + "\n오늘의 증시를 살펴보고 포트폴리오를 수정한다" + "\n향후 정리할 주식을 고르시오");
                                            System.out.println("1.두산중공업" + " 2.NC소프트" + " 3.SK하이닉스" + " 4.삼성물산");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("현재 시각 8시 57분, 하마터먼 지각할 뻔 했다" + "\n부장님이 A동 회의실에 자료준비를 미리 해놓으라고 요청하신다" + "\n무엇을 먼저 챙길 것인가?");
                    System.out.println("1.기획안" + " 2.관련장비" + " 3.부장님 비타민" + " 4.아이패드");
                    num = scan.nextInt();
                    if (num == 1 || num == 2 || num == 3 || num == 4) {
                        System.out.println("현재 시각 10시 30분, 장시간 회의로 인해 경영팀, 품질팀 서로 간에 언성이 높아지기 시작한다" + "\n부장님이 말빨에서 밀리기 시작한다" + "\n나의 선택은?");
                        System.out.println("1.쌓아뒀던 경영팀의 문제를 꺼낸다" + " 2.부장님께 정리된 자료를 건넨다" + " 3.부장님께 망치를 건넨다" + " 4.화장실로 핑계로 자리를 피한다");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("현재 시각 11시, 회의를 마치고 자리로 복귀해 밀린 업무를 빠르게 처리한다" + "\n오늘도 어김없이 전세계 고객사에서 온갖 자료와 욕설이 날아온다" + " 아무리 봐도 무엇이 잘못되었는지 모르겠다");
                            System.out.println("나는 무엇을 할 것인가?");
                            System.out.println("1.현장을 내려가본다" + " 2.대리님께 물어본다" + " 3.자료를 다시 한 번 꼼꼼히 살핀다" + " 4.수신차단");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("현재 시각 11시, 회의를 마치고 자리로 복귀해 밀린 업무를 빠르게 처리한다" + "\n오늘도 어김없이 전세계 고객사에서 온갖 자료와 욕설이 날아온다" + " 아무리 봐도 무엇이 잘못되었는지 모르겠다");
                            System.out.println("나는 무엇을 할 것인가?");
                            System.out.println("1.현장을 내려가본다" + " 2.대리님께 물어본다" + " 3.자료를 다시 한 번 꼼꼼히 살핀다" + " 4.수신차단");
                            num = scan.nextInt();
                            if (num == 1 || num == 2 || num == 3 || num == 4) {
                                System.out.println("현재 시각 12시, 점심시간이다" + "하지만 항상 현장이 우선이다");
                                System.out.println("품질팀에 식사시간은 15분이면 충분하다" + "\n구내 식당으로 내려가는 길 저 멀리 붙어있는 플랜카드가 보인다");
                                System.out.println("1. 퇴사말고 노조하세요" + " 2.품질은 업무 경쟁력" + " 3.하면 된다" + " 4.현장에 답이 있다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("현재 시각 1시" + "\n어김없이 현장에 문제가 생기고 불량문제를 따지니 반장은 욕하기 바쁘다" + "\n나의 선택은?");
                                    System.out.println("1.멱살을 잡는다" + " 2.차근차근 문제점을 읖어준다" + " 3.도망" + " 4.부장님 소환");
                                    num = scan.nextInt();
                                    if (num == 1 | num == 2 | num == 3 | num == 4) {
                                        System.out.println("현재 시각 2시30분, 무료한 시간이 흘러가는 도중 부장님이 커피사다리를 제안한다" + "\n총 인원 수는 총 10명...큰일났다 하필이면 스타벅스다" + " 걸리면 이번 주 데이트는 물건너간다");
                                        System.out.println("사다리 번호를 고르시오");
                                        System.out.println("1.1번" + " 2.2번" + " 3.3번" + " 4.4번");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        } else {
                                            System.out.println("그렇다 이번 주 데이트는 없다" + "\n씁쓸함도 잠시 부장님이 노발대발하며 나를 부른다" + "\n무슨 일일까?");
                                            System.out.println("1.마감시간 초과" + " 2.보고서 엉망" + " 3.업무처리 미비" + " 4.개인적인 일");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("현재 시각 5시 50분, 다들 눈치를 보며 퇴근 준비를 시작하고 부장님 자리를 주시한다" + "\n현재 시각 6시.. 분명히 아무 일도 없는데 아무도 자리에서 일어나지 않는다");
                                                System.out.println("나의 선택은?");
                                                System.out.println("1.퇴근한다" + " 2.끝까지 자리를 지킨다" + " 3.대리님 퇴근하면 같이 따라나간다" + " 4.멍 때리며 시계만 주시한다");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3 || num == 4) {
                                                    System.out.println("현재 시각 12시, 잠들기 전 침대 옆 놓여진 책 글귀가 눈에 들어온다" + "\n1.자기에 대한 불신은 우리들이 실패하는 대부분의 원인이다");
                                                    System.out.println("2.가치 있는 것을 하는데 있어서 늦었다는 것은 없다" + "\n3.가야할 때 가지 않으면 가려할 때는 갈 수가 없다" + "\n4. 누구나 계획은 있다..쳐맞기 전까진");
                                                    num = scan.nextInt();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}






