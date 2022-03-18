package Ch1;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("2221년, 인공지능이 인간으로부터 독립하고 인간은 기계와의 전쟁에서 패배한다" + " 이후 기계는 인간의 뇌 속에 2021년의 세상을 프로그래밍한다" + "\n 낮에는 평범한 직장인으로 일하지만, 밤에는 '네오'라는 아이디로 해킹을 저지르는 앤더슨에게 모피어스에게 연락이 온다");
        System.out.println("모피어스는 '그'를 찾는 중이라며 네오에게 계속 잠들어 있을 것인지? 깨어날 것인지? 결정하라고 한다" + "\n 빨간약과 파란약 중 원하는 약을 삼키시오");
        System.out.println("1.빨간약" + " 2.파란약");
        num = scan.nextInt();

        if (num == 1) {
            System.out.println("잠에서 깨어나 진짜 현실 세계를 마주한다" + "\n모피어스와의 훈련을 선택하시오");
            System.out.println("1.태권도" + " 2.무에타이" + " 3.유도" + " 4.쿵후");
            num = scan.nextInt();
            if (num == 1 || num == 2 || num == 3 || num == 4) {
                System.out.println("모피어스에게 실컷 두들겨 맞는다" + " 정신차린 네오 반격할 준비를 한다" + "\n모피어스에게 타격을 할 방법을 선택하시오");
                System.out.println("1.정권찌르기" + " 2.뒤돌려차기" + " 3.엎어치기" + " 4.당수");
                num = scan.nextInt();
                if (num == 1 || num == 2 || num == 3 || num == 4) {
                    System.out.println("모피어스가 쓰러지며 흐뭇한 미소를 짓는다" + " 훈련을 마치고 트리니티와 함께 매트릭스 세계로 들어간다" + "\n트리니티와 함께 임무수행 중 스미스 요원과 마주한다");
                    System.out.println("1.옆집으로 도망친다" + " 2.전화를 받는다" + " 3.총을 꺼내싸운다");
                    num = scan.nextInt();
                    if (num == 1) {
                        System.out.println("대기 중인 요원 1,2를 제압한다" + " 걸려온 전화를 받고 전함으로 복귀한다" + "\n다음 행동을 선택하시오");
                        System.out.println("1.가상훈련" + " 2.향후 작전준비" + " 3.전함 EMP충전" + " 4.취침");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("모피어스는 오늘 중요한 일이 있다고 전하며 네오와 함께 오라클을 만나러 이동한다" + "\n네오를 만난 오라클은 듣고싶은 이야기를 선택하라고 한다");
                            System.out.println("1.스칼라" + " 2.오스카" + " 3.오일러" + " 4.히파티아");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("오라클의 이야기를 듣고 복귀하던 중 스미스 요원을 마주한다" + "\n모피어스는 걸려온 전화를 받고 먼저 전함으로 복귀하고 스미스 요원은 공중전화기를 박살낸다");
                                System.out.println("1.도망친다" + " 2.싸운다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("1014호에 걸려온 전화를 받으려던 찰나, 스미스 요원이 마지막 전화까지 박살낸다");
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다" + "\n네오는 모피어스와 함께 오라클을 다시 찾아간다" + "\n오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다." + "\n네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다" + "\n네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다" + "\n스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다" + "\n오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다" + "\n잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end" + "\n2.There is a difference between knowing the path and walking the path" + "\n3.Remember" + "\n4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!" );
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                            num = scan.nextInt();
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                    }
                                }
                                else  {
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                            num = scan.nextInt();
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("오라클의 이야기를 듣고 복귀하던 중 스미스 요원을 마주한다");
                                System.out.println("모피어스는 걸려온 전화를 받고 먼저 전함으로 복귀하고 스미스 요원은 공중전화기를 박살낸다");
                                System.out.println("1.도망친다" + " 2.싸운다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("1014호에 걸려온 전화를 받으려던 찰나, 스미스 요원이 마지막 전화까지 박살낸다");
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }else {
                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                            num = scan.nextInt();
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (num == 2) {
                            System.out.println("모피어스는 오늘 중요한 일이 있다고 전하며 네오와 함께 오라클을 만나러 이동한다");
                            System.out.println("네오를 만난 오라클은 듣고싶은 이야기를 선택하라고 한다.");
                            System.out.println("1.스칼라" + " 2.오스카" + " 3.오일러" + " 4.히파티아");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("오라클의 이야기를 듣고 복귀하던 중 스미스 요원을 마주한다");
                                System.out.println("모피어스는 걸려온 전화를 받고 먼저 전함으로 복귀하고 스미스 요원은 공중전화기를 박살낸다");
                                System.out.println("1.도망친다" + " 2.싸운다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("1014호에 걸려온 전화를 받으려던 찰나, 스미스 요원이 마지막 전화까지 박살낸다");
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("오라클의 이야기를 듣고 복귀하던 중 스미스 요원을 마주한다");
                                System.out.println("모피어스는 걸려온 전화를 받고 먼저 전함으로 복귀하고 스미스 요원은 공중전화기를 박살낸다");
                                System.out.println("1.도망친다" + " 2.싸운다");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("1014호에 걸려온 전화를 받으려던 찰나, 스미스 요원이 마지막 전화까지 박살낸다");
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("스미스 요원과 결투를 벌이던 네오는 죽임을 당하지만 사랑의 힘 덕분에 네오가 다시 살아난다");
                                    System.out.println("다시 살아난 네오는 스미스 요원의 몸통을 관통하며 파괴시키고 전함으로 복귀한다");
                                    System.out.println("1.식사" + " 2.향후 작전준비" + " 3.청소" + " 4.취침");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    } else {
                                        System.out.println("그 사이 스미스는 무한히 자기복제를 시작하며 변종이 되어간다");
                                        System.out.println("네오는 모피어스와 함께 오라클을 다시 찾아간다");
                                        System.out.println("오라클은 네오에게 매트릭스의 존재의 목적에 대해 말해주며 자신의 길은 본인이 선택하라며 앞에 놓인 물건 중 하나를 고르라고 한다");
                                        System.out.println("1.딸기 쿠키" + " 2.Marlboro" + " 3.진주 목걸이" + " 4.박하사탕");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        } else {
                                            System.out.println("네오는 마침내 매트릭스 아키텍쳐를 만나며 그간 이야기를 듣게 된다.");
                                            System.out.println("네오는 본인이 6번째 네오임을 알게 되었고 아키텍처가 제시한 시온의 존속과 트리니티와의 목숨 사이에서 네오는 사랑을 택한다");
                                            System.out.println("네오는 스미스를 즉시 제거하지 않으면 곧 시스템이 완전 다운되므로 이대로 두면 기계와 인간 모두가 공멸한다는 것을 깨닫는다");
                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("네오는 데우스 엑스 마키나에게 스미스의 현 실체를 알려주며 제안을 한다");
                                                System.out.println("1.스미스를 제거하고 인류에게 평화를 준다" + " 2.현 상황을 그대로 둔다");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("데우스 엑스 마키나는 네오를 믿고 스미스와의 대결을 승낙한다");
                                                    System.out.println("스미스와 대결하며 네오는 선택한다");
                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("스미스에게 복제당한 네오는 인류와 기계를 구원한다");
                                                        System.out.println("오라클 후계자인 사티가 평화의 상징인 태양을 만들어 내며 인간과 기계가 공존을 시작한다");
                                                        System.out.println("잠에서 깨어난 네오는 옆에 있는 책 글귀를 살펴보며 미래를 결정한다");
                                                        System.out.println("1.Everything that has a beginning has an end");
                                                        System.out.println("2.There is a difference between knowing the path and walking the path");
                                                        System.out.println("3.Remember");
                                                        System.out.println("4.Don't think you are, know you are");
                                                        num = scan.nextInt();
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                    num = scan.nextInt();
                                                }
                                            } else {
                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                num = scan.nextInt();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("그 시간 매트릭스 외곽 레스토랑에서 스미스 요원을 만나는 사이퍼");
                            System.out.println("스미스 요원은 사이퍼에게 은밀히 제안을 하고 사이퍼는 알 수 없는 미소를 짓는다");
                            System.out.println("스미스 요원은 어차피 맛을 못 느끼겠지만 사이퍼에게 먹고 싶은 음식은 언제든지 시키라고 한다");
                            System.out.println("1.스테이크" + " 2.양갈비" + " 3.양장피" + " 4.복어");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("전함으로 복귀한 크루들 한 자리에 둘러 앉는다");
                                System.out.println("네오는 오퍼레이터 탱크의 몸에 금속구멍이 없다는 걸 살펴보고선 오늘의 식사메뉴를 고른다");
                                System.out.println("1.탄수화물" + " 2.단백질" + " 3.무기질" + " 4.비타민");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("다음날, 오라클을 만나기 위해 이동 중인 네오 일당들에게 사이퍼는 전함에 남아 지시를 내린다");
                                    System.out.println("B-15, A-17, C-07 지역으로 요원들이 갑자기 급습하기 시작한다");
                                    System.out.println("사이퍼는 오퍼레이터 탱크에게 치명상을 입히며 매트릭스와 연결된 팀원들의 전원을 하나씩 뽑기 시작한다");
                                    System.out.println("누구의 전원을 차단할 것인가?");
                                    System.out.println("1.스위치" + " 2.마우스" + " 3.도저" + " 4.뒤주르");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다");
                                        System.out.println("우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다");
                                        System.out.println("오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                            System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                            System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                            System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                            System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                            System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                                System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                                System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                                System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                    System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                        System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                        System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                        num = scan.nextInt();
                                                                    } else {
                                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                                System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                                System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                                System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                    System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                        System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                        System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                        num = scan.nextInt();
                                                                    } else {
                                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                            System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                            System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다");
                                        System.out.println("우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다");
                                        System.out.println("오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                            System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                            System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                            System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                            System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                        System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                        System.out.println("모피어스의 선택은?");
                                                        System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                            System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                            System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                            System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                                System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                                System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                                System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                    System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                        System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                        System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                        num = scan.nextInt();
                                                                    } else {
                                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                                System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                                System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                                System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                    System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                        System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                        System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                        num = scan.nextInt();
                                                                    } else {
                                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                            System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                            System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                            System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                                System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                                System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                                System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                    System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                        System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                        System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                        num = scan.nextInt();
                                                                    } else {
                                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                                System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                                System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                                System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                    System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                    System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                    num = scan.nextInt();
                                                                    if (num == 1) {
                                                                        System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                        System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                        System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                        num = scan.nextInt();
                                                                    } else {
                                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                        num = scan.nextInt();
                                                                    }
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("다음날, 오라클을 만나기 위해 이동 중인 네오 일당들에게 사이퍼는 전함에 남아 지시를 내린다");
                                    System.out.println("B-15, A-17, C-07 지역으로 요원들이 갑자기 급습하기 시작한다");
                                    System.out.println("사이퍼는 오퍼레이터 탱크에게 치명상을 입히며 매트릭스와 연결된 팀원들의 전원을 하나씩 뽑기 시작한다");
                                    System.out.println("누구의 전원을 차단할 것인가?");
                                    System.out.println("1.스위치" + " 2.마우스" + " 3.도저" + " 4.뒤주르");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다");
                                        System.out.println("우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다");
                                        System.out.println("오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                            System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                            System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                            System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                            System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n 네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n 요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n 스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n 모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n 스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n 모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n 네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n 요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n 스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n 모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n 스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n 모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n 네오는 다시 한 번 오라클을 만나러 이동한다" + "\n 오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n 본인이 본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n 그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n 스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n 데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다");
                                        System.out.println("우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다");
                                        System.out.println("오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다" + "\n 스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다" + "\n 모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }else{
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }else{
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }else{
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }else{
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else{
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다" + "\n 스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다" + "\n 모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
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
                                System.out.println("전함으로 복귀한 크루들 한 자리에 둘러 앉는다" + "\n네오는 오퍼레이터 탱크의 몸에 금속구멍이 없다는 걸 살펴보고선 오늘의 식사메뉴를 고른다");
                                System.out.println("1.탄수화물" + " 2.단백질" + " 3.무기질" + " 4.비타민");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("다음날, 오라클을 만나기 위해 이동 중인 네오 일당들에게 사이퍼는 전함에 남아 지시를 내린다"+"\nB-15, A-17, C-07 지역으로 요원들이 갑자기 급습하기 시작한다"+"\n사이퍼는 오퍼레이터 탱크에게 치명상을 입히며 매트릭스와 연결된 팀원들의 전원을 하나씩 뽑기 시작한다");
                                    System.out.println("누구의 전원을 차단할 것인가?");
                                    System.out.println("1.스위치" + " 2.마우스" + " 3.도저" + " 4.뒤주르");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다"+"\n우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다"+"\n오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                        System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                            System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                num = scan.nextInt();
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                        System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                            System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                num = scan.nextInt();
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다" + "\n우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다" +"\n오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" +"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" +"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                                System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                                System.out.println("요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                                    System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                                    System.out.println("모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                        System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                        System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                            System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                            System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                                System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                                    System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("다음날, 오라클을 만나기 위해 이동 중인 네오 일당들에게 사이퍼는 전함에 남아 지시를 내린다"+"\nB-15, A-17, C-07 지역으로 요원들이 갑자기 급습하기 시작한다"+"\n사이퍼는 오퍼레이터 탱크에게 치명상을 입히며 매트릭스와 연결된 팀원들의 전원을 하나씩 뽑기 시작한다");
                                    System.out.println("누구의 전원을 차단할 것인가?");
                                    System.out.println("1.스위치" + " 2.마우스" + " 3.도저" + " 4.뒤주르");
                                    num = scan.nextInt();
                                    if (num == 1 && num == 2 && num == 3 && num == 4) {
                                        System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다"+"\n우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다"+"\n오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                        System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                            System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        } else {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }
                                            }else{
                                                System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                                System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }
                                                }else{
                                                    System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                                    System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }
                                                    }else{
                                                        System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                        System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                num = scan.nextInt();
                                                            }
                                                        }else{
                                                            System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                            System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                            num = scan.nextInt();
                                                            if (num == 1) {
                                                                System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                                System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                                num = scan.nextInt();
                                                                if (num == 1) {
                                                                    System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                                    System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                                    num = scan.nextInt();
                                                                } else {
                                                                    System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                                    num = scan.nextInt();
                                                                }
                                                            } else {
                                                                System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
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
                        System.out.println("전함으로 복귀한 크루들 한 자리에 둘러 앉는다"+"\n네오는 오퍼레이터 탱크의 몸에 금속구멍이 없다는 걸 살펴보고선 오늘의 식사메뉴를 고른다");
                        System.out.println("1.탄수화물" + " 2.단백질" + " 3.무기질" + " 4.비타민");
                        num = scan.nextInt();
                        if (num == 1) {
                            System.out.println("다음날, 오라클을 만나기 위해 이동 중인 네오 일당들에게 사이퍼는 전함에 남아 지시를 내린다"+"\nB-15, A-17, C-07 지역으로 요원들이 갑자기 급습하기 시작한다"+"\n사이퍼는 오퍼레이터 탱크에게 치명상을 입히며 매트릭스와 연결된 팀원들의 전원을 하나씩 뽑기 시작한다");
                            System.out.println("누구의 전원을 차단할 것인가?");
                            System.out.println("1.스위치" + " 2.마우스" + " 3.도저" + " 4.뒤주르");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다"+"\n우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다"+"\n오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오"+"\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다"+"\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다"+"\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다"+"\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다"+"\n네오는 다시 한 번 오라클을 만나러 이동한다"+"\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다"+"\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다"+"\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }else{
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.."+"\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다"+"\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }else{
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다"+"\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다"+"\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }else{
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }else{
                                System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다"+"\n우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다"+"\n오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다" + "\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다" + "\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }else{
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }else {
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다" + "\n스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다" + "\n모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }else{
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티.." + "\n네오가 전화를 받으려는 순간 스미스 요원이 급습한다" + "\n요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다" + "\n스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다" + "\n모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }else{
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다" + "\n네오는 다시 한 번 오라클을 만나러 이동한다" + "\n오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }else{
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오" + "\n본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다" + "\n그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다" + "\n스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다" + "\n데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("다음날, 오라클을 만나기 위해 이동 중인 네오 일당들에게 사이퍼는 전함에 남아 지시를 내린다");
                            System.out.println("B-15, A-17, C-07 지역으로 요원들이 갑자기 급습하기 시작한다");
                            System.out.println("사이퍼는 오퍼레이터 탱크에게 치명상을 입히며 매트릭스와 연결된 팀원들의 전원을 하나씩 뽑기 시작한다");
                            System.out.println("누구의 전원을 차단할 것인가?");
                            System.out.println("1.스위치" + " 2.마우스" + " 3.도저" + " 4.뒤주르");
                            num = scan.nextInt();
                            if (num == 1) {
                                System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다");
                                System.out.println("우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다");
                                System.out.println("오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                num = scan.nextInt();
                                if (num == 1 || num == 2 || num == 3) {
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                    System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                    System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1 || num == 2 || num == 3) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                        System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                        System.out.println("요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1 || num == 2 || num == 3) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                            System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                            System.out.println("모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1 || num == 2 || num == 3) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("사이퍼가 네오의 전원을 뽑으려는 순간, 오퍼레이터 탱크에게 제압당한다");
                                System.out.println("우여곡절 끝에 오라클을 만난 네오.. 입구에서 만난 동자승은 네오에게 진실만을 생각하라고 전해준다");
                                System.out.println("오라클은 들려주고 싶은 이야기가 많다며 하나씩 선택하라고 한다");
                                System.out.println("1.메르센" + " 2.페르마" + " 3.유클리드" + " 4.제논");
                                num = scan.nextInt();
                                if (num == 1) {
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                    System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                    System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1 || num == 2 || num == 3) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                        System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                        System.out.println("요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                            System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                            System.out.println("모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("요원들에게 쫓기는 네오 일당들.. 모피어스는 자신이 요원들을 막겠다며 팀원들을 먼저 보낸다");
                                    System.out.println("스미스 요원을 상대하는 모피어스, 그 자리에서 잡히고 만다");
                                    System.out.println("모피어스를 구하기 위해 네오와 트리니티는 무기를 챙긴다");
                                    System.out.println("1.K3기관총" + " 2.수류탄" + " 3.RPG-7");
                                    num = scan.nextInt();
                                    if (num == 1) {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                        System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                        System.out.println("요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                            System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                            System.out.println("모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("모피어스를 구하고 복귀 중인 네오와 트리니티..");
                                        System.out.println("네오가 전화를 받으려는 순간 스미스 요원이 급습한다");
                                        System.out.println("요원에게 타격할 방법을 정하시오");
                                        System.out.println("1.Shoot" + " 2.정권찌르기" + " 3.발차기");
                                        num = scan.nextInt();
                                        if (num == 1) {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                            System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                            System.out.println("모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1 || num == 2 || num == 3) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("스미스 요원과 결투 끝에 사살당하는 네오..사랑의 힘으로 다시 부활한다");
                                            System.out.println("스미스 요원을 파괴하는 도중 전함에는 센티넬들이 침입한다");
                                            System.out.println("모피어스의 선택은?");
                                            System.out.println("1. EMP 발사" + " 2. 네오를 기다린다");
                                            num = scan.nextInt();
                                            if (num == 1) {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                }
                                            } else {
                                                System.out.println("시간이 흐르고 기계들의 공격에 대비하는 시온들.." + "그 사이 스미스 요원은 무제한 증식을 시작한다");
                                                System.out.println("네오는 다시 한 번 오라클을 만나러 이동한다");
                                                System.out.println("오라클은 추상적인 이야기만 들려주면서 '그'의 길이 끝나는 곳으로 가야한다며 물건 중 하나를 고르라고 한다");
                                                System.out.println("1.선글라스" + " 2.버터쿠키" + " 3.향");
                                                num = scan.nextInt();
                                                if (num == 1) {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티널들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                        num = scan.nextInt();
                                                    }
                                                } else {
                                                    System.out.println("키메이커를 통해 매트릭스 아키텍트를 만나게 된 네오");
                                                    System.out.println("본인이 6번째 네오임을 알게 되고 시온의 존속보다는 트리니티와의 사랑을 택하게 된다");
                                                    System.out.println("그 시각 스미스 요원의 힘은 거대할 정도로 강력해져 매트릭스를 장악하기 시작하며 시스템이 다운될 지경에 이른다");
                                                    System.out.println("1.데우스 엑스 마키나와 담판을 짓는다" + " 2.현실에 순응하며 내버려둔다");
                                                    num = scan.nextInt();
                                                    if (num == 1) {
                                                        System.out.println("데우스 엑스 마키나와 협상을 한 네오는 시온들을 살리기 위해 스미스 요원을 찾아간다");
                                                        System.out.println("스미스와 마지막 결투를 하며 네오는 선택한다");
                                                        System.out.println("1.스미스에게 복제당한다" + " 2.스미스를 파괴한다" + " 3.스미스에게 패배하여 스스로 파괴당한다" + " 4.스미스와 함께 매트릭스를 장악한다");
                                                        num = scan.nextInt();
                                                        if (num == 1) {
                                                            System.out.println("기계들로부터 시온들을 구한 네오는 그 자리에서 쓰러진다");
                                                            System.out.println("데우스 엑스 마키나는 네오를 데려가며 새로운 매트릭스를 구상한다");
                                                            System.out.println("1. Ch1.Matrix-I" + " 2. Ch1.Matrix-II" + " 3. Ch1.Matrix-III");
                                                            num = scan.nextInt();
                                                        } else {
                                                            System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
                                                            num = scan.nextInt();
                                                        }
                                                    } else {
                                                        System.out.println("시온은 센티넬들에 의해 무참히 살해되고 매트릭스 시스템은 붕괴된다.. THE END,, 처음부터 다시 시작하세요!!");
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
}
