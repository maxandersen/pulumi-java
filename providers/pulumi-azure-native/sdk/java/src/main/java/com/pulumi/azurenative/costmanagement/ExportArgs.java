// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.costmanagement.enums.FormatType;
import com.pulumi.azurenative.costmanagement.inputs.ExportDefinitionArgs;
import com.pulumi.azurenative.costmanagement.inputs.ExportDeliveryInfoArgs;
import com.pulumi.azurenative.costmanagement.inputs.ExportScheduleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExportArgs Empty = new ExportArgs();

    /**
     * Has the definition for the export.
     * 
     */
    @Import(name="definition", required=true)
      private final Output<ExportDefinitionArgs> definition;

    public Output<ExportDefinitionArgs> definition() {
        return this.definition;
    }

    /**
     * Has delivery information for the export.
     * 
     */
    @Import(name="deliveryInfo", required=true)
      private final Output<ExportDeliveryInfoArgs> deliveryInfo;

    public Output<ExportDeliveryInfoArgs> deliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> eTag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * Export Name.
     * 
     */
    @Import(name="exportName")
      private final @Nullable Output<String> exportName;

    public Output<String> exportName() {
        return this.exportName == null ? Codegen.empty() : this.exportName;
    }

    /**
     * The format of the export being delivered. Currently only 'Csv' is supported.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<Either<String,FormatType>> format;

    public Output<Either<String,FormatType>> format() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * Has schedule information for the export.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<ExportScheduleArgs> schedule;

    public Output<ExportScheduleArgs> schedule() {
        return this.schedule == null ? Codegen.empty() : this.schedule;
    }

    /**
     * The scope associated with export operations. This includes '/subscriptions/{subscriptionId}/' for subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for Management Group scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for billingProfile scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}' for invoiceSection scope, and '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    public ExportArgs(
        Output<ExportDefinitionArgs> definition,
        Output<ExportDeliveryInfoArgs> deliveryInfo,
        @Nullable Output<String> eTag,
        @Nullable Output<String> exportName,
        @Nullable Output<Either<String,FormatType>> format,
        @Nullable Output<ExportScheduleArgs> schedule,
        Output<String> scope) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.deliveryInfo = Objects.requireNonNull(deliveryInfo, "expected parameter 'deliveryInfo' to be non-null");
        this.eTag = eTag;
        this.exportName = exportName;
        this.format = format;
        this.schedule = schedule;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private ExportArgs() {
        this.definition = Codegen.empty();
        this.deliveryInfo = Codegen.empty();
        this.eTag = Codegen.empty();
        this.exportName = Codegen.empty();
        this.format = Codegen.empty();
        this.schedule = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ExportDefinitionArgs> definition;
        private Output<ExportDeliveryInfoArgs> deliveryInfo;
        private @Nullable Output<String> eTag;
        private @Nullable Output<String> exportName;
        private @Nullable Output<Either<String,FormatType>> format;
        private @Nullable Output<ExportScheduleArgs> schedule;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.eTag = defaults.eTag;
    	      this.exportName = defaults.exportName;
    	      this.format = defaults.format;
    	      this.schedule = defaults.schedule;
    	      this.scope = defaults.scope;
        }

        public Builder definition(Output<ExportDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder definition(ExportDefinitionArgs definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }
        public Builder deliveryInfo(Output<ExportDeliveryInfoArgs> deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }
        public Builder deliveryInfo(ExportDeliveryInfoArgs deliveryInfo) {
            this.deliveryInfo = Output.of(Objects.requireNonNull(deliveryInfo));
            return this;
        }
        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder exportName(@Nullable Output<String> exportName) {
            this.exportName = exportName;
            return this;
        }
        public Builder exportName(@Nullable String exportName) {
            this.exportName = Codegen.ofNullable(exportName);
            return this;
        }
        public Builder format(@Nullable Output<Either<String,FormatType>> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable Either<String,FormatType> format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder schedule(@Nullable Output<ExportScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable ExportScheduleArgs schedule) {
            this.schedule = Codegen.ofNullable(schedule);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public ExportArgs build() {
            return new ExportArgs(definition, deliveryInfo, eTag, exportName, format, schedule, scope);
        }
    }
}
