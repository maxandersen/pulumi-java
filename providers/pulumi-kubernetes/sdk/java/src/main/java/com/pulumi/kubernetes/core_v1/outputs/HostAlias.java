// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostAlias {
    /**
     * @return Hostnames for the above IP address.
     * 
     */
    private final @Nullable List<String> hostnames;
    /**
     * @return IP address of the host file entry.
     * 
     */
    private final @Nullable String ip;

    @CustomType.Constructor
    private HostAlias(
        @CustomType.Parameter("hostnames") @Nullable List<String> hostnames,
        @CustomType.Parameter("ip") @Nullable String ip) {
        this.hostnames = hostnames;
        this.ip = ip;
    }

    /**
     * @return Hostnames for the above IP address.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames == null ? List.of() : this.hostnames;
    }
    /**
     * @return IP address of the host file entry.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAlias defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> hostnames;
        private @Nullable String ip;

        public Builder() {
    	      // Empty
        }

        public Builder(HostAlias defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        public Builder hostnames(@Nullable List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }        public HostAlias build() {
            return new HostAlias(hostnames, ip);
        }
    }
}
