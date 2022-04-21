// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The start and end date for pulling data for the report.
 * 
 */
public final class ReportConfigTimePeriodResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReportConfigTimePeriodResponse Empty = new ReportConfigTimePeriodResponse();

    /**
     * The start date to pull data from.
     * 
     */
    @Import(name="from", required=true)
    private String from;

    public String from() {
        return this.from;
    }

    /**
     * The end date to pull data to.
     * 
     */
    @Import(name="to", required=true)
    private String to;

    public String to() {
        return this.to;
    }

    private ReportConfigTimePeriodResponse() {}

    private ReportConfigTimePeriodResponse(ReportConfigTimePeriodResponse $) {
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportConfigTimePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportConfigTimePeriodResponse $;

        public Builder() {
            $ = new ReportConfigTimePeriodResponse();
        }

        public Builder(ReportConfigTimePeriodResponse defaults) {
            $ = new ReportConfigTimePeriodResponse(Objects.requireNonNull(defaults));
        }

        public Builder from(String from) {
            $.from = from;
            return this;
        }

        public Builder to(String to) {
            $.to = to;
            return this;
        }

        public ReportConfigTimePeriodResponse build() {
            $.from = Objects.requireNonNull($.from, "expected parameter 'from' to be non-null");
            $.to = Objects.requireNonNull($.to, "expected parameter 'to' to be non-null");
            return $;
        }
    }

}
