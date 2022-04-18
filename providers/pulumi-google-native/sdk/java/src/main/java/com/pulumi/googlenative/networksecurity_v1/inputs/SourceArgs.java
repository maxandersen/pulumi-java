// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification of traffic source attributes.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
     * 
     */
    @Import(name="ipBlocks")
      private final @Nullable Output<List<String>> ipBlocks;

    public Output<List<String>> ipBlocks() {
        return this.ipBlocks == null ? Codegen.empty() : this.ipBlocks;
    }

    /**
     * Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, "namespace/*") or a suffix match (example, // *{@literal /}service-account") or a presence match "*". Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
     * 
     */
    @Import(name="principals")
      private final @Nullable Output<List<String>> principals;

    public Output<List<String>> principals() {
        return this.principals == null ? Codegen.empty() : this.principals;
    }

    public SourceArgs(
        @Nullable Output<List<String>> ipBlocks,
        @Nullable Output<List<String>> principals) {
        this.ipBlocks = ipBlocks;
        this.principals = principals;
    }

    private SourceArgs() {
        this.ipBlocks = Codegen.empty();
        this.principals = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ipBlocks;
        private @Nullable Output<List<String>> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlocks = defaults.ipBlocks;
    	      this.principals = defaults.principals;
        }

        public Builder ipBlocks(@Nullable Output<List<String>> ipBlocks) {
            this.ipBlocks = ipBlocks;
            return this;
        }
        public Builder ipBlocks(@Nullable List<String> ipBlocks) {
            this.ipBlocks = Codegen.ofNullable(ipBlocks);
            return this;
        }
        public Builder ipBlocks(String... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }
        public Builder principals(@Nullable Output<List<String>> principals) {
            this.principals = principals;
            return this;
        }
        public Builder principals(@Nullable List<String> principals) {
            this.principals = Codegen.ofNullable(principals);
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }        public SourceArgs build() {
            return new SourceArgs(ipBlocks, principals);
        }
    }
}
