create database BD_MVC_DAO;
use BD_MVC_DAO;

create table EXEMPLO_01(
A01_Codigo int(11) auto_increment primary key,
A01_Nome text not null
);


Delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `PROC_INSEXEMPLO`(IN V_Nome text)
BEGIN
	insert into EXEMPLO_01(A01_Nome)
    values(V_Nome);
    commit;
END
$$

Delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `PROC_UPDEXEMPLO`(IN V_Codigo int(11), in V_Nome text)
BEGIN
	update EXEMPLO_01 
    set A01_Nome = V_Nome where A01_Codigo = V_Codigo;
    commit;
END
$$

Delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `PROC_DELEXEMPLO`(IN V_Codigo int(11))
BEGIN
	delete from EXEMPLO_01 where A01_Codigo = V_Codigo;
    commit;
END
$$