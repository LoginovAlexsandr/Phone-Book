@Test
void testFindByNumber() {
    PhoneBook pb = new PhoneBook();
    pb.add("Alice", "123");
    pb.add("Bob", "456");
    assertEquals("Alice", pb.findByNumber("123"));
    assertEquals("Bob", pb.findByNumber("456"));
}

@Test
void testFindByNumberNotFound() {
    PhoneBook pb = new PhoneBook();
    assertNull(pb.findByNumber("999"));
}