// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.storage.inputs.ObjectReplicationPolicyRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectReplicationPolicyArgs extends ResourceArgs {

    public static final ObjectReplicationPolicyArgs Empty = new ObjectReplicationPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Required. Destination account name.
     * 
     */
    @Import(name="destinationAccount", required=true)
    private Output<String> destinationAccount;

    /**
     * @return Required. Destination account name.
     * 
     */
    public Output<String> destinationAccount() {
        return this.destinationAccount;
    }

    /**
     * The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
     * 
     */
    @Import(name="objectReplicationPolicyId")
    private @Nullable Output<String> objectReplicationPolicyId;

    /**
     * @return The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
     * 
     */
    public Optional<Output<String>> objectReplicationPolicyId() {
        return Optional.ofNullable(this.objectReplicationPolicyId);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage account object replication rules.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ObjectReplicationPolicyRuleArgs>> rules;

    /**
     * @return The storage account object replication rules.
     * 
     */
    public Optional<Output<List<ObjectReplicationPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Required. Source account name.
     * 
     */
    @Import(name="sourceAccount", required=true)
    private Output<String> sourceAccount;

    /**
     * @return Required. Source account name.
     * 
     */
    public Output<String> sourceAccount() {
        return this.sourceAccount;
    }

    private ObjectReplicationPolicyArgs() {}

    private ObjectReplicationPolicyArgs(ObjectReplicationPolicyArgs $) {
        this.accountName = $.accountName;
        this.destinationAccount = $.destinationAccount;
        this.objectReplicationPolicyId = $.objectReplicationPolicyId;
        this.resourceGroupName = $.resourceGroupName;
        this.rules = $.rules;
        this.sourceAccount = $.sourceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectReplicationPolicyArgs $;

        public Builder() {
            $ = new ObjectReplicationPolicyArgs();
        }

        public Builder(ObjectReplicationPolicyArgs defaults) {
            $ = new ObjectReplicationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param destinationAccount Required. Destination account name.
         * 
         * @return builder
         * 
         */
        public Builder destinationAccount(Output<String> destinationAccount) {
            $.destinationAccount = destinationAccount;
            return this;
        }

        /**
         * @param destinationAccount Required. Destination account name.
         * 
         * @return builder
         * 
         */
        public Builder destinationAccount(String destinationAccount) {
            return destinationAccount(Output.of(destinationAccount));
        }

        /**
         * @param objectReplicationPolicyId The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
         * 
         * @return builder
         * 
         */
        public Builder objectReplicationPolicyId(@Nullable Output<String> objectReplicationPolicyId) {
            $.objectReplicationPolicyId = objectReplicationPolicyId;
            return this;
        }

        /**
         * @param objectReplicationPolicyId The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
         * 
         * @return builder
         * 
         */
        public Builder objectReplicationPolicyId(String objectReplicationPolicyId) {
            return objectReplicationPolicyId(Output.of(objectReplicationPolicyId));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param rules The storage account object replication rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ObjectReplicationPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The storage account object replication rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ObjectReplicationPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The storage account object replication rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(ObjectReplicationPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param sourceAccount Required. Source account name.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccount(Output<String> sourceAccount) {
            $.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * @param sourceAccount Required. Source account name.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccount(String sourceAccount) {
            return sourceAccount(Output.of(sourceAccount));
        }

        public ObjectReplicationPolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.destinationAccount = Objects.requireNonNull($.destinationAccount, "expected parameter 'destinationAccount' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sourceAccount = Objects.requireNonNull($.sourceAccount, "expected parameter 'sourceAccount' to be non-null");
            return $;
        }
    }

}
