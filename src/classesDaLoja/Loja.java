package classesDaLoja;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.*;
/*import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;*/

public class Loja {
	
	private static int painel = 0;
	private int saldo;
	private String comprasFeitas = "";

	public void setSaldo(int s) {
		saldo = s;
	}

	public int getSaldo() {
		return saldo;
	}

	public void produtosComprados(String produto) {
		comprasFeitas += produto;
	}

	public void maisDinheiro() {
		try {
			int maisDinheiro = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Quanto mais dinheiro você quer adicionar?", "Adicionar mais saldo", JOptionPane.QUESTION_MESSAGE));
			setSaldo(saldo + maisDinheiro);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Valor inserido inválido! Tente novamente.", "Erro",
					JOptionPane.WARNING_MESSAGE);
			maisDinheiro();
		}
	}

	Loja() throws IOException {
		JFrame frame = new JFrame();
		frame.setTitle("LOJA GEEK LTV");
		
		// ----------------------------Painel da imagem da Logo
		JPanel painelLogo = new JPanel();
		BufferedImage imagemPrincipal = ImageIO.read(new File("C:\\Users\\andre\\Desktop\\Bagulos\\Imagens/javalogo.png"));
		JLabel labelLogo = new JLabel(new ImageIcon(imagemPrincipal));
		painelLogo.add(labelLogo);
		// ----------------------------Fim do Painel da imagem da Logo

		// ----------------------------Painel da foto do grupo
		JPanel painelEquipe = new JPanel();
//		BufferedImage fotoDaEquipe = ImageIO.read(new File("C:\\\\Users\\\\Andrew\\\\Documents\\\\imagensJava/b.jpg"));
		JLabel labelEquipe = new JLabel(new ImageIcon());
		painelEquipe.add(labelEquipe);
		// ----------------------------Fim da foto do grupo

		JPanel painelJogosA = new JPanel();
		JPanel painelJogosB = new JPanel();
		JPanel painelJogosC = new JPanel();
		JPanel painelFilmesA = new JPanel();
		JPanel painelFilmesB = new JPanel();
		JPanel painelFilmesC = new JPanel();
		JPanel painelAccA = new JPanel();
		JPanel painelAccB = new JPanel();
		JPanel painelAccC = new JPanel();

		MeuJButton jogoA1, jogoA2, jogoA3, jogoB1, jogoB2, jogoB3, jogoC1, jogoC2, jogoC3;
		MeuJButton filmeA1, filmeA2, filmeA3, filmeB1, filmeB2, filmeB3, filmeC1, filmeC2, filmeC3;
		MeuJButton accA1, accA2, accA3, accB1, accB2, accB3, accC1, accC2, accC3;
		// acc é a abreviação de acessório

		jogoA1 = new MeuJButton("Uncharted 4: A Thief's End (R$ 150)");
		jogoA2 = new MeuJButton("Call of Duty WW2 (R$ 200)");
		jogoA3 = new MeuJButton("Rise of the Tomb Raider (R$ 250)");

		jogoB1 = new MeuJButton("Resident Evil 2 (R$ 250)");
		jogoB2 = new MeuJButton("Outlast 2 (R$ 50)");
		jogoB3 = new MeuJButton("Alien: Isolation (R$ 100)");
		jogoB1.setForeground(Color.red);
		jogoB2.setForeground(Color.red);
		jogoB3.setForeground(Color.red);

		jogoC1 = new MeuJButton("God of War (R$ 200)");
		jogoC2 = new MeuJButton("Sekiro: Shadows Die Twice (R$ 230)");
		jogoC3 = new MeuJButton("The Witcher 3: Wild Hunt (R$ 150)");

		filmeA1 = new MeuJButton("Vingadores: Ultimato (R$ 60)");
		filmeA2 = new MeuJButton("Star Wars: Os Últimos Jedi (R$ 40)");
		filmeA3 = new MeuJButton("Jurassic World: Reino Ameaçado (R$ 30)");

		filmeB1 = new MeuJButton("Anabelle 2 (R$ 30)");
		filmeB2 = new MeuJButton("Histórias de Fantasma (R$ 30)");
		filmeB3 = new MeuJButton("It A Coisa Capítulo 2 (R$ 60)");
		filmeB1.setForeground(Color.red);
		filmeB2.setForeground(Color.red);
		filmeB3.setForeground(Color.red);

		filmeC1 = new MeuJButton("500 Dias Com Ela (R$ 15)");
		filmeC2 = new MeuJButton("Uma Linda Mulher (R$ 10)");
		filmeC3 = new MeuJButton("Simplesmente Acontece (R$ 20)");

		accA1 = new MeuJButton("Caneca do Batman (R$ 40)");
		accA2 = new MeuJButton("Caneca do Homem de Ferro (R$ 40)");
		accA3 = new MeuJButton("Caneca do Homem Formiga (R$ 40)");

		accB1 = new MeuJButton("Camisa de Game of Thrones (R$ 30)");
		accB2 = new MeuJButton("Camisa de Sons of Anarchy (R$ 30)");
		accB3 = new MeuJButton("Camisa de Breaking Bad (R$ 30)");

		accC1 = new MeuJButton("Máscara do Capitão América (R$ 25)");
		accC2 = new MeuJButton("Máscara do Coringa (R$ 25)");
		accC3 = new MeuJButton("Máscara do Thanos (R$ 25)");

//---------------------------------------------------------------Grupo JOGOSA		

		Container conteinerJogosA = new Container();
		conteinerJogosA.setLayout(new FlowLayout());
		
		conteinerJogosA.add(jogoA1);
		conteinerJogosA.add(jogoA2);
		conteinerJogosA.add(jogoA3);

		painelJogosA.add(conteinerJogosA);
		painelJogosA.setBackground(Color.decode("#FFF000"));

//---------------------------------------------------------------Grupo JOGOSB

		Container conteinerJogosB = new Container();
		conteinerJogosB.setLayout(new FlowLayout());

		conteinerJogosB.add(jogoB1);
		conteinerJogosB.add(jogoB2);
		conteinerJogosB.add(jogoB3);

		painelJogosB.add(conteinerJogosB);
		painelJogosB.setBackground(Color.black);

//---------------------------------------------------------------Grupo JOGOSC

		Container conteinerJogosC = new Container();
		conteinerJogosC.setLayout(new FlowLayout());

		conteinerJogosC.add(jogoC1);
		conteinerJogosC.add(jogoC2);
		conteinerJogosC.add(jogoC3);

		painelJogosC.add(conteinerJogosC);
		painelJogosC.setBackground(Color.green);

//---------------------------------------------------------------Grupo FILMESA

		Container conteinerFilmesA = new Container();
		conteinerFilmesA.setLayout(new FlowLayout());

		conteinerFilmesA.add(filmeA1);
		conteinerFilmesA.add(filmeA2);
		conteinerFilmesA.add(filmeA3);

		painelFilmesA.add(conteinerFilmesA);
		painelFilmesA.setBackground(Color.decode("#FFF000"));

//---------------------------------------------------------------Grupo FILMESB

		Container conteinerFilmesB = new Container();
		conteinerFilmesB.setLayout(new FlowLayout());

		conteinerFilmesB.add(filmeB1);
		conteinerFilmesB.add(filmeB2);
		conteinerFilmesB.add(filmeB3);

		painelFilmesB.add(conteinerFilmesB);
		painelFilmesB.setBackground(Color.black);
//---------------------------------------------------------------Grupo FILMESC

		Container conteinerFilmesC = new Container();
		conteinerFilmesC.setLayout(new FlowLayout());

		conteinerFilmesC.add(filmeC1);
		conteinerFilmesC.add(filmeC2);
		conteinerFilmesC.add(filmeC3);

		painelFilmesC.add(conteinerFilmesC);
		painelFilmesC.setBackground(Color.pink);

//---------------------------------------------------------------Grupo ACESSÓRIOSA

		Container conteinerAccA = new Container();
		conteinerAccA.setLayout(new FlowLayout());

		conteinerAccA.add(accA1);
		conteinerAccA.add(accA2);
		conteinerAccA.add(accA3);

		painelAccA.add(conteinerAccA);
		painelAccA.setBackground(Color.green);

//---------------------------------------------------------------Grupo ACESSÓRIOSB

		Container conteinerAccB = new Container();
		conteinerAccB.setLayout(new FlowLayout());

		conteinerAccB.add(accB1);
		conteinerAccB.add(accB2);
		conteinerAccB.add(accB3);

		painelAccB.add(conteinerAccB);
		painelAccB.setBackground(Color.red);

//---------------------------------------------------------------Grupo ACESSÓRIOSC

		Container conteinerAccC = new Container();
		conteinerAccC.setLayout(new FlowLayout());

		conteinerAccC.add(accC1);
		conteinerAccC.add(accC2);
		conteinerAccC.add(accC3);

		painelAccC.add(conteinerAccC);
		painelAccC.setBackground(Color.blue);

//--------------------------------------------config do menu
		JMenuBar barraMenu = new JMenuBar();

		JMenu jogos = new JMenu("Jogos");
		JMenu filmes = new JMenu("Filmes");
		JMenu acc = new JMenu("Acessórios");
		JMenu acoes = new JMenu("Ações");
		JMenu mais = new JMenu("Informações");

		JMenuItem jogosAcao = new JMenuItem("Ação");
		JMenuItem jogosTerror = new JMenuItem("Terror");
		JMenuItem jogosAventura = new JMenuItem("Aventura");

		JMenuItem filmesAcao = new JMenuItem("Ação");
		JMenuItem filmesTerror = new JMenuItem("Terror");
		JMenuItem filmesRomance = new JMenuItem("Romance");

		JMenuItem acessoriosCanecas = new JMenuItem("Canecas");
		JMenuItem acessoriosCamisas = new JMenuItem("Camisas");
		JMenuItem acessoriosMascaras = new JMenuItem("Máscaras");

		JMenuItem verSaldo = new JMenuItem("Ver saldo atual");
		JMenuItem adicionarSaldo = new JMenuItem("Adicionar mais dinheiro");
		JMenuItem produtosComprados = new JMenuItem("Ver produtos comprados");
		JMenuItem equipe = new JMenuItem("Ver foto da equipe realizadora");
		JMenuItem informacoes = new JMenuItem("Informações");
		JMenuItem telaInicial = new JMenuItem("Voltar ao início");

		jogos.add(jogosAcao);
		jogos.add(jogosTerror);
		jogos.add(jogosAventura);

		filmes.add(filmesAcao);
		filmes.add(filmesTerror);
		filmes.add(filmesRomance);

		acc.add(acessoriosCanecas);
		acc.add(acessoriosCamisas);
		acc.add(acessoriosMascaras);

		acoes.add(verSaldo);
		acoes.add(adicionarSaldo);
		acoes.add(produtosComprados);

		mais.add(equipe);
		mais.add(informacoes);
		mais.add(telaInicial);

		JLabel labelCompras = new JLabel("   Compras:");
		labelCompras.setForeground(Color.blue);
		
		JLabel labelOutros = new JLabel("    Outros:");
		labelOutros.setForeground(Color.red);

		barraMenu.add(labelCompras);
		barraMenu.add(jogos);
		barraMenu.add(filmes);
		barraMenu.add(acc);
		barraMenu.add(labelOutros);
		barraMenu.add(acoes);
		barraMenu.add(mais);
//--------------------------------------------fim das configs do menu

//-------------------------------------------------------------configs do Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(barraMenu);
		frame.setResizable(false);
		frame.setContentPane(painelLogo);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
//-------------------------------------------------------------fim das configs do Frame

//-------------------------------------------------------------ação dos botões de ver e adicionar saldo
		verSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == verSaldo) {
					JOptionPane.showMessageDialog(null, "Seu saldo atual é: R$" + saldo, "Saldo atual",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		adicionarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == adicionarSaldo) {
					maisDinheiro();
				}
			}
		});

//-------------------------------------------------------------ação do botão de exibir compras
		produtosComprados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == produtosComprados) {
					if (comprasFeitas != null) {
						JOptionPane.showMessageDialog(null, comprasFeitas, "Produtos comprados",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});

//-------------------------------------------------------------ações do painel de ações
		equipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == equipe) {
					frame.setContentPane(painelEquipe);
					frame.pack();
					frame.setLocationRelativeTo(null);
				}
			}
		});

		informacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == informacoes) {
					JOptionPane.showMessageDialog(null,
							"Projeto feito por:\nAndrew Monteiro\nJoão Victor Vieira\nSteicie Aleixo\nFabiely Silva\nAghata Sara",
							"Informações", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});

		telaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == telaInicial) {
					frame.setContentPane(painelLogo);
					frame.pack();
					frame.setLocationRelativeTo(null);
				}
			}
		});
//-------------------------------------------------------------fim da ações do painel de ações

//-----------------------------------------------------------ações dos jogosA
		jogosAcao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 1) {
					frame.setContentPane(painelJogosA);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 1;
				}
			}
		});

		jogoA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoA1) {
					if (saldo >= 150) {
						setSaldo(saldo - 150);
						JOptionPane.showMessageDialog(null, "Uncharted 4: A Thief's End foi comprado!", "Compra efetuada com sucesso!",
								JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Uncharted 4: A Thief's End\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		jogoA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoA2) {
					if (saldo >= 200) {
						setSaldo(saldo - 200);
						JOptionPane.showMessageDialog(null, "Call of Duty WW2 foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Call of Duty WW2\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		jogoA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoA3) {
					if (saldo >= 250) {
						setSaldo(saldo - 250);
						JOptionPane.showMessageDialog(null, "Rise of the Tomb Raider foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Rise of the Tomb Raider\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos jogosB
		jogosTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 2) {
					frame.setContentPane(painelJogosB);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 2;
				}
			}
		});

		jogoB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoB1) {
					if (saldo >= 250) {
						setSaldo(saldo - 250);
						JOptionPane.showMessageDialog(null, "Resident Evil 2 foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Resident Evil 2\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		jogoB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoB2) {
					if (saldo >= 50) {
						setSaldo(saldo - 50);
						JOptionPane.showMessageDialog(null, "Outlast 2 foi comprado!", "Compra efetuada com sucesso!",
								JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Outlast 2\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		jogoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoB3) {
					if (saldo >= 100) {
						setSaldo(saldo - 100);
						JOptionPane.showMessageDialog(null, "Alien: Isolation foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Alien: Isolation\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos jogosC
		jogosAventura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 3) {
					frame.setContentPane(painelJogosC);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 3;
				}
			}
		});

		jogoC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoC1) {
					if (saldo >= 200) {
						setSaldo(saldo - 200);
						JOptionPane.showMessageDialog(null, "God of War foi comprado!", "Compra efetuada com sucesso!",
								JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("God of War\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		jogoC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoC2) {
					if (saldo >= 230) {
						setSaldo(saldo - 230);
						JOptionPane.showMessageDialog(null, "Sekiro: Shadows Die Twice foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Sekiro: Shadows Die Twice\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		jogoC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jogoC3) {
					if (saldo >= 150) {
						setSaldo(saldo - 150);
						JOptionPane.showMessageDialog(null, "The Witcher 3: Wild Hunt foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("The Witcher 3: Wild Hunt\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este jogo.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos filmesA		
		filmesAcao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 4) {
					frame.setContentPane(painelFilmesA);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 4;
				}
			}
		});

		filmeA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeA1) {
					if (saldo >= 60) {
						setSaldo(saldo - 60);
						JOptionPane.showMessageDialog(null, "Vingadores: Ultimato foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Vingadores: Ultimato\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		filmeA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeA2) {
					if (saldo >= 40) {
						setSaldo(saldo - 40);
						JOptionPane.showMessageDialog(null, "Star Wars: Os Últimos Jedi foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Star Wars: Os Últimos Jedi\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		filmeA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeA3) {
					if (saldo >= 30) {
						setSaldo(saldo - 30);
						JOptionPane.showMessageDialog(null, "Jurassic World: Reino Ameaçado foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Jurassic World: Reino Ameaçado\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos filmesB		
		filmesTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 5) {
					frame.setContentPane(painelFilmesB);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 5;
				}
			}
		});

		filmeB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeB1) {
					if (saldo >= 30) {
						setSaldo(saldo - 30);
						JOptionPane.showMessageDialog(null, "Anabelle 2 foi comprado!", "Compra efetuada com sucesso!",
								JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Anabelle 2\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		filmeB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeB2) {
					if (saldo >= 30) {
						setSaldo(saldo - 30);
						JOptionPane.showMessageDialog(null, "Histórias de Fantasma foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Histórias de Fantasma\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		filmeB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeB3) {
					if (saldo >= 60) {
						setSaldo(saldo - 60);
						JOptionPane.showMessageDialog(null, "It A Coisa Capítulo 2 foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("It A Coisa Capítulo 2\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos filmesC
		filmesRomance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 6) {
					frame.setContentPane(painelFilmesC);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 6;
				}
			}
		});

		filmeC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeC1) {
					if (saldo >= 15) {
						setSaldo(saldo - 15);
						JOptionPane.showMessageDialog(null, "500 Dias Com Ela foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("500 Dias Com Ela\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		filmeC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeC2) {
					if (saldo >= 10) {
						setSaldo(saldo - 10);
						JOptionPane.showMessageDialog(null, "Uma Linda Mulher foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Uma Linda Mulher\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		filmeC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == filmeC3) {
					if (saldo >= 20) {
						setSaldo(saldo - 20);
						JOptionPane.showMessageDialog(null, "Simplesmente Acontece foi comprado!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Simplesmente Acontece\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar este filme.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos acessóriosA
		acessoriosCanecas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 7) {
					frame.setContentPane(painelAccA);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 7;
				}
			}
		});

		accA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accA1) {
					if (saldo >= 40) {
						setSaldo(saldo - 40);
						JOptionPane.showMessageDialog(null, "Caneca do Batman foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Caneca do Batman\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta caneca.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		accA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accA2) {
					if (saldo >= 40) {
						setSaldo(saldo - 40);
						JOptionPane.showMessageDialog(null, "Caneca do Homem de Ferro foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Caneca do Homem de Ferro\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta caneca.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		accA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accA3) {
					if (saldo >= 40) {
						setSaldo(saldo - 40);
						JOptionPane.showMessageDialog(null, "Caneca do Homem Formiga foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Caneca do Homem Formiga\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta caneca.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos acessóriosB
		acessoriosCamisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 8) {
					frame.setContentPane(painelAccB);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 8;
				}
			}
		});

		accB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accB1) {
					if (saldo >= 30) {
						setSaldo(saldo - 30);
						JOptionPane.showMessageDialog(null, "Camisa de Game of Thrones foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Camisa de Game of Thrones\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta camisa.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		accB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accB2) {
					if (saldo >= 30) {
						setSaldo(saldo - 30);
						JOptionPane.showMessageDialog(null, "Camisa de Sons of Anarchy foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Camisa de Sons of Anarchy\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta camisa.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		accB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accB3) {
					if (saldo >= 30) {
						setSaldo(saldo - 30);
						JOptionPane.showMessageDialog(null, "Camisa de Breaking Bad foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Camisa de Breaking Bad\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta camisa.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

//-----------------------------------------------------------ações dos acessóriosC
		acessoriosMascaras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (painel != 9) {
					frame.setContentPane(painelAccC);
					frame.pack();
					frame.setLocationRelativeTo(null);
					painel = 9;
				}
			}
		});

		accC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accC1) {
					if (saldo >= 25) {
						setSaldo(saldo - 25);
						JOptionPane.showMessageDialog(null, "Máscara do Capitão América foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Máscara do Capitão América\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta máscara.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		accC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accC2) {
					if (saldo >= 25) {
						setSaldo(saldo - 25);
						JOptionPane.showMessageDialog(null, "Máscara do Coringa foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Máscara do Coringa\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta máscara.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		accC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == accC3) {
					if (saldo >= 25) {
						setSaldo(saldo - 25);
						JOptionPane.showMessageDialog(null, "Máscara do Thanos foi comprada!",
								"Compra efetuada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Seu saldo agora é de: R$" + getSaldo(), "Saldo atual",
								JOptionPane.INFORMATION_MESSAGE);
						produtosComprados("Máscara do Thanos\n");
					} else {
						JOptionPane.showMessageDialog(null,
								"Você não tem dinheiro o suficiente para comprar esta máscara.", "Saldo insuficiente!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
	}
}
