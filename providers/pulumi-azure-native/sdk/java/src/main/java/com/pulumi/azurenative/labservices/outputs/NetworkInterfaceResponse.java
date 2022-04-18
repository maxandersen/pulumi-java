// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkInterfaceResponse {
    /**
     * PrivateIp address of the Compute VM
     * 
     */
    private final String privateIpAddress;
    /**
     * Connection information for Windows
     * 
     */
    private final String rdpAuthority;
    /**
     * Connection information for Linux
     * 
     */
    private final String sshAuthority;
    /**
     * Username of the VM
     * 
     */
    private final String username;

    @CustomType.Constructor
    private NetworkInterfaceResponse(
        @CustomType.Parameter("privateIpAddress") String privateIpAddress,
        @CustomType.Parameter("rdpAuthority") String rdpAuthority,
        @CustomType.Parameter("sshAuthority") String sshAuthority,
        @CustomType.Parameter("username") String username) {
        this.privateIpAddress = privateIpAddress;
        this.rdpAuthority = rdpAuthority;
        this.sshAuthority = sshAuthority;
        this.username = username;
    }

    /**
     * PrivateIp address of the Compute VM
     * 
    */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * Connection information for Windows
     * 
    */
    public String rdpAuthority() {
        return this.rdpAuthority;
    }
    /**
     * Connection information for Linux
     * 
    */
    public String sshAuthority() {
        return this.sshAuthority;
    }
    /**
     * Username of the VM
     * 
    */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateIpAddress;
        private String rdpAuthority;
        private String sshAuthority;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
    	      this.username = defaults.username;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public Builder rdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }
        public Builder sshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(privateIpAddress, rdpAuthority, sshAuthority, username);
        }
    }
}
