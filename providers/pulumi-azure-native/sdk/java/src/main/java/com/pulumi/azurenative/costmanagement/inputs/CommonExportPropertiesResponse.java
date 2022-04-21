// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.inputs.ExportDefinitionResponse;
import com.pulumi.azurenative.costmanagement.inputs.ExportDeliveryInfoResponse;
import com.pulumi.azurenative.costmanagement.inputs.ExportExecutionListResultResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The common properties of the export.
 * 
 */
public final class CommonExportPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final CommonExportPropertiesResponse Empty = new CommonExportPropertiesResponse();

    /**
     * Has the definition for the export.
     * 
     */
    @Import(name="definition", required=true)
    private ExportDefinitionResponse definition;

    public ExportDefinitionResponse definition() {
        return this.definition;
    }

    /**
     * Has delivery information for the export.
     * 
     */
    @Import(name="deliveryInfo", required=true)
    private ExportDeliveryInfoResponse deliveryInfo;

    public ExportDeliveryInfoResponse deliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * The format of the export being delivered. Currently only &#39;Csv&#39; is supported.
     * 
     */
    @Import(name="format")
    private @Nullable String format;

    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * If the export has an active schedule, provides an estimate of the next execution time.
     * 
     */
    @Import(name="nextRunTimeEstimate", required=true)
    private String nextRunTimeEstimate;

    public String nextRunTimeEstimate() {
        return this.nextRunTimeEstimate;
    }

    /**
     * If requested, has the most recent execution history for the export.
     * 
     */
    @Import(name="runHistory")
    private @Nullable ExportExecutionListResultResponse runHistory;

    public Optional<ExportExecutionListResultResponse> runHistory() {
        return Optional.ofNullable(this.runHistory);
    }

    private CommonExportPropertiesResponse() {}

    private CommonExportPropertiesResponse(CommonExportPropertiesResponse $) {
        this.definition = $.definition;
        this.deliveryInfo = $.deliveryInfo;
        this.format = $.format;
        this.nextRunTimeEstimate = $.nextRunTimeEstimate;
        this.runHistory = $.runHistory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommonExportPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommonExportPropertiesResponse $;

        public Builder() {
            $ = new CommonExportPropertiesResponse();
        }

        public Builder(CommonExportPropertiesResponse defaults) {
            $ = new CommonExportPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder definition(ExportDefinitionResponse definition) {
            $.definition = definition;
            return this;
        }

        public Builder deliveryInfo(ExportDeliveryInfoResponse deliveryInfo) {
            $.deliveryInfo = deliveryInfo;
            return this;
        }

        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        public Builder nextRunTimeEstimate(String nextRunTimeEstimate) {
            $.nextRunTimeEstimate = nextRunTimeEstimate;
            return this;
        }

        public Builder runHistory(@Nullable ExportExecutionListResultResponse runHistory) {
            $.runHistory = runHistory;
            return this;
        }

        public CommonExportPropertiesResponse build() {
            $.definition = Objects.requireNonNull($.definition, "expected parameter 'definition' to be non-null");
            $.deliveryInfo = Objects.requireNonNull($.deliveryInfo, "expected parameter 'deliveryInfo' to be non-null");
            $.nextRunTimeEstimate = Objects.requireNonNull($.nextRunTimeEstimate, "expected parameter 'nextRunTimeEstimate' to be non-null");
            return $;
        }
    }

}
