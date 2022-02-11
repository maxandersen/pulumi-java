// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostAliasArgs Empty = new HostAliasArgs();

    @InputImport(name="hostnames")
    private final @Nullable Input<List<String>> hostnames;

    public Input<List<String>> getHostnames() {
        return this.hostnames == null ? Input.empty() : this.hostnames;
    }

    @InputImport(name="ip")
    private final @Nullable Input<String> ip;

    public Input<String> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    public HostAliasArgs(
        @Nullable Input<List<String>> hostnames,
        @Nullable Input<String> ip) {
        this.hostnames = hostnames;
        this.ip = ip;
    }

    private HostAliasArgs() {
        this.hostnames = Input.empty();
        this.ip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> hostnames;
        private @Nullable Input<String> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(HostAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        public Builder setHostnames(@Nullable Input<List<String>> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        public Builder setHostnames(@Nullable List<String> hostnames) {
            this.hostnames = Input.ofNullable(hostnames);
            return this;
        }

        public Builder setIp(@Nullable Input<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public HostAliasArgs build() {
            return new HostAliasArgs(hostnames, ip);
        }
    }
}
