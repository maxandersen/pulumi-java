// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeInstanceSshSettingsResponse {
    /**
     * Specifies the SSH rsa public key file as a string. Use &#34;ssh-keygen -t rsa -b 2048&#34; to generate your SSH key pairs.
     * 
     */
    private final @Nullable String adminPublicKey;
    /**
     * Describes the admin user name.
     * 
     */
    private final String adminUserName;
    /**
     * Describes the port for connecting through SSH.
     * 
     */
    private final Integer sshPort;
    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
     */
    private final @Nullable String sshPublicAccess;

    @CustomType.Constructor
    private ComputeInstanceSshSettingsResponse(
        @CustomType.Parameter("adminPublicKey") @Nullable String adminPublicKey,
        @CustomType.Parameter("adminUserName") String adminUserName,
        @CustomType.Parameter("sshPort") Integer sshPort,
        @CustomType.Parameter("sshPublicAccess") @Nullable String sshPublicAccess) {
        this.adminPublicKey = adminPublicKey;
        this.adminUserName = adminUserName;
        this.sshPort = sshPort;
        this.sshPublicAccess = sshPublicAccess;
    }

    /**
     * Specifies the SSH rsa public key file as a string. Use &#34;ssh-keygen -t rsa -b 2048&#34; to generate your SSH key pairs.
     * 
    */
    public Optional<String> adminPublicKey() {
        return Optional.ofNullable(this.adminPublicKey);
    }
    /**
     * Describes the admin user name.
     * 
    */
    public String adminUserName() {
        return this.adminUserName;
    }
    /**
     * Describes the port for connecting through SSH.
     * 
    */
    public Integer sshPort() {
        return this.sshPort;
    }
    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
    */
    public Optional<String> sshPublicAccess() {
        return Optional.ofNullable(this.sshPublicAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceSshSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPublicKey;
        private String adminUserName;
        private Integer sshPort;
        private @Nullable String sshPublicAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceSshSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPublicKey = defaults.adminPublicKey;
    	      this.adminUserName = defaults.adminUserName;
    	      this.sshPort = defaults.sshPort;
    	      this.sshPublicAccess = defaults.sshPublicAccess;
        }

        public Builder adminPublicKey(@Nullable String adminPublicKey) {
            this.adminPublicKey = adminPublicKey;
            return this;
        }
        public Builder adminUserName(String adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
        }
        public Builder sshPort(Integer sshPort) {
            this.sshPort = Objects.requireNonNull(sshPort);
            return this;
        }
        public Builder sshPublicAccess(@Nullable String sshPublicAccess) {
            this.sshPublicAccess = sshPublicAccess;
            return this;
        }        public ComputeInstanceSshSettingsResponse build() {
            return new ComputeInstanceSshSettingsResponse(adminPublicKey, adminUserName, sshPort, sshPublicAccess);
        }
    }
}
