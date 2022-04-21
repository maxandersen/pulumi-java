// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.AzureBackupRuleResponse;
import com.pulumi.azurenative.dataprotection.inputs.AzureRetentionRuleResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Rule based backup policy
 * 
 */
public final class BackupPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackupPolicyResponse Empty = new BackupPolicyResponse();

    /**
     * Type of datasource for the backup management
     * 
     */
    @Import(name="datasourceTypes", required=true)
    private List<String> datasourceTypes;

    public List<String> datasourceTypes() {
        return this.datasourceTypes;
    }

    /**
     * Expected value is &#39;BackupPolicy&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private String objectType;

    public String objectType() {
        return this.objectType;
    }

    /**
     * Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    @Import(name="policyRules", required=true)
    private List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

    public List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules() {
        return this.policyRules;
    }

    private BackupPolicyResponse() {}

    private BackupPolicyResponse(BackupPolicyResponse $) {
        this.datasourceTypes = $.datasourceTypes;
        this.objectType = $.objectType;
        this.policyRules = $.policyRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyResponse $;

        public Builder() {
            $ = new BackupPolicyResponse();
        }

        public Builder(BackupPolicyResponse defaults) {
            $ = new BackupPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder datasourceTypes(List<String> datasourceTypes) {
            $.datasourceTypes = datasourceTypes;
            return this;
        }

        public Builder datasourceTypes(String... datasourceTypes) {
            return datasourceTypes(List.of(datasourceTypes));
        }

        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder policyRules(List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
            $.policyRules = policyRules;
            return this;
        }

        public Builder policyRules(Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>... policyRules) {
            return policyRules(List.of(policyRules));
        }

        public BackupPolicyResponse build() {
            $.datasourceTypes = Objects.requireNonNull($.datasourceTypes, "expected parameter 'datasourceTypes' to be non-null");
            $.objectType = Codegen.stringProp("objectType").arg($.objectType).require();
            $.policyRules = Objects.requireNonNull($.policyRules, "expected parameter 'policyRules' to be non-null");
            return $;
        }
    }

}
