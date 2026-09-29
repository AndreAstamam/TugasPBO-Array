public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== 1. MEMBUAT BANK BARU ===");
        Bank bankMandiri = new Bank();
        System.out.println("Bank berhasil didirikan!\n");

        System.out.println("=== 2. PENDAFTARAN NASABAH (Menguji Limit 5) ===");
        bankMandiri.addCustomer("Andre", "Astamam");
        bankMandiri.addCustomer("Budi", "Santoso");
        bankMandiri.addCustomer("Citra", "Kirana");
        bankMandiri.addCustomer("Dewi", "Lestari");
        bankMandiri.addCustomer("Eka", "Putra");
        
        System.out.println("Mencoba memasukkan nasabah ke-6...");
  
        bankMandiri.addCustomer("Fajar", "Nugraha"); 


        System.out.println("\n=== 3. PEMBUKAAN REKENING NASABAH ===");
        Customer andre = bankMandiri.getCustomer(0);
        
        System.out.println("Buka 5 rekening untuk Andre...");
        andre.setAccount(new Account(1000.0)); 
        andre.setAccount(new Account(2000.0)); 
        andre.setAccount(new Account(3000.0)); 
        andre.setAccount(new Account(4000.0)); 
        andre.setAccount(new Account(5000.0)); 

        System.out.println("Mencoba membuka rekening ke-6 untuk Andre...");
        andre.setAccount(new Account(6000.0));


        System.out.println("\n=== 4. SIMULASI TRANSAKSI ===");

        Account rekUtamaAndre = andre.getAccount(0);
        System.out.println("Saldo awal Rekening Utama Andre: " + rekUtamaAndre.getBalance());
        
        System.out.println("Setor uang sejumlah 500...");
        rekUtamaAndre.deposit(500.0);
        
        System.out.println("Tarik uang sejumlah 200...");
        rekUtamaAndre.withdraw(200.0);
        
        System.out.println("Mencoba tarik uang 10.000 (Saldo tidak cukup)...");
        boolean statusTarik = rekUtamaAndre.withdraw(10000.0);
        if (statusTarik == false) {
            System.out.println("-> TRANSAKSI DITOLAK: Saldo tidak mencukupi!");
        }

        System.out.println("\n=== 5. LAPORAN DATA KESELURUHAN BANK ===");

        for (int i = 0; i < bankMandiri.getNumberOfCustomers(); i++) {
            Customer nasabah = bankMandiri.getCustomer(i);
            System.out.println("Nasabah " + (i+1) + ": " + nasabah.getFirstName() + " " + nasabah.getLastName());
            System.out.println("Total Rekening: " + nasabah.getNumberOfAccounts());

            for (int j = 0; j < nasabah.getNumberOfAccounts(); j++) {
                Account rek = nasabah.getAccount(j);
                System.out.println("  -> Rekening " + j + " | Saldo: " + rek.getBalance());
            }
            System.out.println("-----------------------------------");
        }
    }
}