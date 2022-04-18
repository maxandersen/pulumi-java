// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures a RRSetRoutingPolicy that routes in a weighted round robin fashion.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyWrrPolicyArgs Empty = new RRSetRoutingPolicyWrrPolicyArgs();

    @Import(name="items")
      private final @Nullable Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items;

    public Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    public RRSetRoutingPolicyWrrPolicyArgs(
        @Nullable Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items,
        @Nullable Output<String> kind) {
        this.items = items;
        this.kind = kind;
    }

    private RRSetRoutingPolicyWrrPolicyArgs() {
        this.items = Codegen.empty();
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder items(@Nullable Output<List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(RRSetRoutingPolicyWrrPolicyWrrPolicyItemArgs... items) {
            return items(List.of(items));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }        public RRSetRoutingPolicyWrrPolicyArgs build() {
            return new RRSetRoutingPolicyWrrPolicyArgs(items, kind);
        }
    }
}
