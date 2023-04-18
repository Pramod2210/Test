package Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import Dav.AutoComplete;
import Dav.CreateEmployee;
import Dav.DeleteEmployee;
import Dav.ECssproperties;
import Dav.EIframes;
import Dav.EImages;
import Dav.ELinks;
import Dav.EMenu;
import Dav.EPoppus;
import Dav.ESlider;
import Dav.ETooltips;
import Dav.MultipalTabs;
import Dav.SearchEmployee;
import Dav.Setting;
import Dav.UpdateEmployee;
import Pojo.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getConnection();
		System.out.println("--** Login Credentials **--");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();

		System.out.println("--** Welcome to JALA Academy **-- ");
		System.out.println();
		char k;
		do {
			System.out.println("Welcome to Dashbord");
			System.out.println();
			System.out.println("1)Employee\n 2) More \n 3) Setting");
			System.out.println("please select any one option which you want to see more information");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				char ch;
				do {
					System.out.println("1) Insert Employee Data\n2)Search Employee\n3)Update data\n4)Delete data");
					System.out.println("enter your choise number");
					int i = sc.nextInt();
					switch (i) {
					case 1: {
						ArrayList<Employee> emp = new ArrayList<>();
						CreateEmployee e = new CreateEmployee();
						e.insert(con, emp);
						break;
					}
					case 2: {
						SearchEmployee s = new SearchEmployee();
						s.search(con);
						break;
					}
					case 3: {
						UpdateEmployee u = new UpdateEmployee();
						u.update(con);
						break;
					}
					case 4: {
						DeleteEmployee d = new DeleteEmployee();
						d.delete(con);
						break;
					}
					default: {
						System.out.println("invalid Entry !!");
					}
					}
					System.out.println("do you want to any Other Operation in Employee y/n");
					ch = sc.next().charAt(0);
				} while (ch == 'Y' || ch == 'y');
			}

			case 2: {
				char ch;
				System.out.println(
						"1)Multiple Tab\n2)Menu\n3)AutoComplete\n4)Images\n5)Slider\n6)ToolTips\n7)Popups\n8)Links\n9)Css Prpperties\n10)Iframes");
				System.out.println("enter your choice number");
				int i = sc.nextInt();
				switch (i) {
				case 1: {
					MultipalTabs m = new MultipalTabs();
					System.out.println("a)Plan to Succeed\nb)Unlearning\nc)Ways of Unlearning");
					System.out.println("enter your choice");
					char ic = sc.next().charAt(0);
					switch (ic) {
					case 'a': {
						m.planToSuccedde();
						break;
					}
					case 'b': {
						m.unLearling();
						break;
					}
					case 'c': {
						m.Waysofunlearning();
						break;
					}
					default:
						System.out.println("invalid Entry !!");
					}
					break;

				}
				
				case 2: {
					EMenu m = new EMenu();
					System.out.println("1)Topic\2)SubTopic");
					System.out.println("Enter Choice number");
					int l = sc.nextInt();
					switch (l) {
					case 1: {
						m.singleMenus();
						break;
					}
					case 2: {
						m.submenu();
						break;
					}
					}
				}
				case 3: {
					AutoComplete a = new AutoComplete();
					a.display();
					break;
				}
				case 4: {
					EImages e = new EImages();
					e.images();
					break;
				}
				case 5: {
					ESlider s = new ESlider();
					s.Slider();
					break;
				}
				case 6: {
					ETooltips t = new ETooltips();
					t.tooltips();
					break;
				}
				case 7: {
					EPoppus p = new EPoppus();
					p.popups();
					break;
				}
				case 8: {
					ELinks l = new ELinks();
					l.links();
					break;
				}
				case 9: {
					ECssproperties e = new ECssproperties();
					e.cssProperties();
					break;
				}
				case 10: {
					EIframes e = new EIframes();
					e.iframes();
					break;
				}
				default:
					System.out.println("Invalid Entry");
				}
                break;
			}
			case 3: {
				Setting s = new Setting();
				s.setting();
				break;
			}
			default:
				System.out.println("Invalid entry !!");

			}
			System.out.println("Do you want to continue y/n !");
			k = sc.next().charAt(0);
		} while (k == 'Y' || k == 'y');
	}
}
