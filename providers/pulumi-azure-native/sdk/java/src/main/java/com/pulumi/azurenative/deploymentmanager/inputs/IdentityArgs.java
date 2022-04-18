// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The list of identities.
     * 
     */
    @Import(name="identityIds", required=true)
      private final Output<List<String>> identityIds;

    public Output<List<String>> identityIds() {
        return this.identityIds;
    }

    /**
     * The identity type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public IdentityArgs(
        Output<List<String>> identityIds,
        Output<String> type) {
        this.identityIds = Objects.requireNonNull(identityIds, "expected parameter 'identityIds' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IdentityArgs() {
        this.identityIds = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> identityIds;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.type = defaults.type;
        }

        public Builder identityIds(Output<List<String>> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }
        public Builder identityIds(List<String> identityIds) {
            this.identityIds = Output.of(Objects.requireNonNull(identityIds));
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public IdentityArgs build() {
            return new IdentityArgs(identityIds, type);
        }
    }
}
