// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.PoolIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The identity of the Batch pool, if configured. If the pool identity is updated during update an existing pool, only the new vms which are created after the pool shrinks to 0 will have the updated identities
 * 
 */
public final class BatchPoolIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final BatchPoolIdentityArgs Empty = new BatchPoolIdentityArgs();

    /**
     * The type of identity used for the Batch Pool.
     * 
     */
    @Import(name="type", required=true)
    private Output<PoolIdentityType> type;

    public Output<PoolIdentityType> type() {
        return this.type;
    }

    /**
     * The list of user identities associated with the Batch pool. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private BatchPoolIdentityArgs() {}

    private BatchPoolIdentityArgs(BatchPoolIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchPoolIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchPoolIdentityArgs $;

        public Builder() {
            $ = new BatchPoolIdentityArgs();
        }

        public Builder(BatchPoolIdentityArgs defaults) {
            $ = new BatchPoolIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<PoolIdentityType> type) {
            $.type = type;
            return this;
        }

        public Builder type(PoolIdentityType type) {
            return type(Output.of(type));
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public BatchPoolIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
