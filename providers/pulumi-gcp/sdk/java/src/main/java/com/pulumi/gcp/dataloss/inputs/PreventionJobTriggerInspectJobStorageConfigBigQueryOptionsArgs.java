// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs Empty = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs();

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    @Import(name="tableReference", required=true)
    private Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs> tableReference;

    public Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs> tableReference() {
        return this.tableReference;
    }

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs() {}

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs $) {
        this.tableReference = $.tableReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs();
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs defaults) {
            $ = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder tableReference(Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs> tableReference) {
            $.tableReference = tableReference;
            return this;
        }

        public Builder tableReference(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs tableReference) {
            return tableReference(Output.of(tableReference));
        }

        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs build() {
            $.tableReference = Objects.requireNonNull($.tableReference, "expected parameter 'tableReference' to be non-null");
            return $;
        }
    }

}
