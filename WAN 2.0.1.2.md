### Objectives

Describe the benefits of using PPP over HDLC in a WAN.

This activity can be completed individually or in small groups of 2-3 students per group.

### Scenario

Your network engineering supervisor recently attended a networking conference where Layer 2 protocols were discussed. He knows that you have Cisco equipment on the premises, but he would also like to offer security and advanced TCP/IP options and controls on that same equipment by using the Point-to-Point Protocol (PPP).

After researching the PPP protocol, you find it offers some advantages over the HDLC protocol, currently used on your network.

**Create a matrix listing the advantages and disadvantages of using the HDLC vs. PPP protocols. When comparing the two protocols, include:**

* Ease of configuration  
* Adaptability to non-proprietary network equipment  
* Security options  
* Bandwidth usage and compression  
* Bandwidth consolidation

Share your chart with another student or class. Justify whether or not you would suggest sharing the matrix with the network engineering supervisor to justify a change being made from HDLC to PPP for Layer 2 network connectivity.

| Feature | High-Level Data Link Control  | Point-to-Point Protocol |
| ----- | ----- | ----- |
| Ease of Configuration | Default for all Cisco devices, simple configuration | Can be more complex, depending on the PPP options and protocols implemented |
| Adaptability to Non-Proprietary Network Equipment | HDLC is proprietary, not interoperable with other vendors.  | Industry standard. Works well across multi vender environments.  |
| Security Options | No built-in security features | Supports authentication: CHAP (encrypted and secure link passwords) or PAP (non-encrypted link passwords), EAP |
| Bandwidth Usage and Compression | Standard TDM and no built-in compression | Compression available through Compression Control Protocol  |
| Bandwidth Consolidation | Standard serial, no multilink | Supports Multilink PPP for combining links  |

Yes, I would suggest sharing the matrix with the network engineering supervisor to justify a potential move from HDLC to PPP.

The matrix provides a clear, side-by-side comparison of both protocols, making it easier to understand the key advantages of PPP. It directly supports the supervisor’s interest in added security and advanced TCP/IP features by showing that PPP includes built-in authentication and supports multiple protocols, while HDLC does not.

Sharing the matrix also demonstrates initiative and helps back your recommendation with technical facts. It highlights PPP’s flexibility, vendor compatibility, and efficiency—all of which make it a better choice for modern and scalable networks.

Overall, the matrix is a practical tool for starting an informed discussion and showing that PPP could better meet the network’s current and future needs.

