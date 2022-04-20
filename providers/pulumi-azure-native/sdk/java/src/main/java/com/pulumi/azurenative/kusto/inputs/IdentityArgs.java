// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.azurenative.kusto.enums.IdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove all identities.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,IdentityType>> type;

    public Output<Either<String,IdentityType>> type() {
        return this.type;
    }

    /**
     * The list of user identities associated with the Kusto cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Output<Map<String,Object>> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Codegen.empty() : this.userAssignedIdentities;
    }

    public IdentityArgs(
        Output<Either<String,IdentityType>> type,
        @Nullable Output<Map<String,Object>> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityArgs() {
        this.type = Codegen.empty();
        this.userAssignedIdentities = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,IdentityType>> type;
        private @Nullable Output<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(Output<Either<String,IdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,IdentityType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Codegen.ofNullable(userAssignedIdentities);
            return this;
        }        public IdentityArgs build() {
            return new IdentityArgs(type, userAssignedIdentities);
        }
    }
}
