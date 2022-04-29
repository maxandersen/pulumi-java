// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.AzureBackupRuleArgs;
import com.pulumi.azurenative.dataprotection.inputs.AzureRetentionRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Rule based backup policy
 * 
 */
public final class BackupPolicyArgs extends ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * Type of datasource for the backup management
     * 
     */
    @Import(name="datasourceTypes", required=true)
    private Output<List<String>> datasourceTypes;

    /**
     * @return Type of datasource for the backup management
     * 
     */
    public Output<List<String>> datasourceTypes() {
        return this.datasourceTypes;
    }

    /**
     * Expected value is &#39;BackupPolicy&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return
     * Expected value is &#39;BackupPolicy&#39;.
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    @Import(name="policyRules", required=true)
    private Output<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules;

    /**
     * @return Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    public Output<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules() {
        return this.policyRules;
    }

    private BackupPolicyArgs() {}

    private BackupPolicyArgs(BackupPolicyArgs $) {
        this.datasourceTypes = $.datasourceTypes;
        this.objectType = $.objectType;
        this.policyRules = $.policyRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyArgs $;

        public Builder() {
            $ = new BackupPolicyArgs();
        }

        public Builder(BackupPolicyArgs defaults) {
            $ = new BackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasourceTypes Type of datasource for the backup management
         * 
         * @return builder
         * 
         */
        public Builder datasourceTypes(Output<List<String>> datasourceTypes) {
            $.datasourceTypes = datasourceTypes;
            return this;
        }

        /**
         * @param datasourceTypes Type of datasource for the backup management
         * 
         * @return builder
         * 
         */
        public Builder datasourceTypes(List<String> datasourceTypes) {
            return datasourceTypes(Output.of(datasourceTypes));
        }

        /**
         * @param datasourceTypes Type of datasource for the backup management
         * 
         * @return builder
         * 
         */
        public Builder datasourceTypes(String... datasourceTypes) {
            return datasourceTypes(List.of(datasourceTypes));
        }

        /**
         * @param objectType
         * Expected value is &#39;BackupPolicy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType
         * Expected value is &#39;BackupPolicy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param policyRules Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
         * 
         * @return builder
         * 
         */
        public Builder policyRules(Output<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules) {
            $.policyRules = policyRules;
            return this;
        }

        /**
         * @param policyRules Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
         * 
         * @return builder
         * 
         */
        public Builder policyRules(List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>> policyRules) {
            return policyRules(Output.of(policyRules));
        }

        /**
         * @param policyRules Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
         * 
         * @return builder
         * 
         */
        public Builder policyRules(Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>... policyRules) {
            return policyRules(List.of(policyRules));
        }

        public BackupPolicyArgs build() {
            $.datasourceTypes = Objects.requireNonNull($.datasourceTypes, "expected parameter 'datasourceTypes' to be non-null");
            $.objectType = Codegen.stringProp("objectType").output().arg($.objectType).require();
            $.policyRules = Objects.requireNonNull($.policyRules, "expected parameter 'policyRules' to be non-null");
            return $;
        }
    }

}
