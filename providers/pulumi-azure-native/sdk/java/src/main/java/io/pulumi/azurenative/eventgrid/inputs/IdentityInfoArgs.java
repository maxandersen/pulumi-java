// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.enums.IdentityType;
import io.pulumi.azurenative.eventgrid.inputs.UserIdentityPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The identity information for the resource.
 * 
 */
public final class IdentityInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityInfoArgs Empty = new IdentityInfoArgs();

    /**
     * The principal ID of resource identity.
     * 
     */
    @Import(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId == null ? Codegen.empty() : this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,IdentityType>> type;

    public Output<Either<String,IdentityType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

    public Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Codegen.empty() : this.userAssignedIdentities;
    }

    public IdentityInfoArgs(
        @Nullable Output<String> principalId,
        @Nullable Output<String> tenantId,
        @Nullable Output<Either<String,IdentityType>> type,
        @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityInfoArgs() {
        this.principalId = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.type = Codegen.empty();
        this.userAssignedIdentities = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> principalId;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<Either<String,IdentityType>> type;
        private @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = Codegen.ofNullable(principalId);
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,IdentityType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,IdentityType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Codegen.ofNullable(userAssignedIdentities);
            return this;
        }        public IdentityInfoArgs build() {
            return new IdentityInfoArgs(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
