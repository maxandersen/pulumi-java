// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the operating system settings for the HANA instance.
 * 
 */
public final class OSProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSProfileResponse Empty = new OSProfileResponse();

    /**
     * Specifies the host OS name of the HANA instance.
     * 
     */
    @Import(name="computerName")
      private final @Nullable String computerName;

    public Optional<String> computerName() {
        return this.computerName == null ? Optional.empty() : Optional.ofNullable(this.computerName);
    }

    /**
     * This property allows you to specify the type of the OS.
     * 
     */
    @Import(name="osType", required=true)
      private final String osType;

    public String osType() {
        return this.osType;
    }

    /**
     * Specifies the SSH public key used to access the operating system.
     * 
     */
    @Import(name="sshPublicKey")
      private final @Nullable String sshPublicKey;

    public Optional<String> sshPublicKey() {
        return this.sshPublicKey == null ? Optional.empty() : Optional.ofNullable(this.sshPublicKey);
    }

    /**
     * Specifies version of operating system.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    public OSProfileResponse(
        @Nullable String computerName,
        String osType,
        @Nullable String sshPublicKey,
        String version) {
        this.computerName = computerName;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.sshPublicKey = sshPublicKey;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private OSProfileResponse() {
        this.computerName = null;
        this.osType = null;
        this.sshPublicKey = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computerName;
        private String osType;
        private @Nullable String sshPublicKey;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(OSProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerName = defaults.computerName;
    	      this.osType = defaults.osType;
    	      this.sshPublicKey = defaults.sshPublicKey;
    	      this.version = defaults.version;
        }

        public Builder computerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder sshPublicKey(@Nullable String sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public OSProfileResponse build() {
            return new OSProfileResponse(computerName, osType, sshPublicKey, version);
        }
    }
}
