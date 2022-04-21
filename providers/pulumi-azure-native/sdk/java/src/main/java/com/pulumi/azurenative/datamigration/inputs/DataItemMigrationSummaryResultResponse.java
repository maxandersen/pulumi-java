// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Basic summary of a data item migration
 * 
 */
public final class DataItemMigrationSummaryResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataItemMigrationSummaryResultResponse Empty = new DataItemMigrationSummaryResultResponse();

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
    private String endedOn;

    public String endedOn() {
        return this.endedOn;
    }

    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
     */
    @Import(name="errorPrefix", required=true)
    private String errorPrefix;

    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Number of successfully completed items
     * 
     */
    @Import(name="itemsCompletedCount", required=true)
    private Double itemsCompletedCount;

    public Double itemsCompletedCount() {
        return this.itemsCompletedCount;
    }

    /**
     * Number of items
     * 
     */
    @Import(name="itemsCount", required=true)
    private Double itemsCount;

    public Double itemsCount() {
        return this.itemsCount;
    }

    /**
     * Name of the item
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    @Import(name="resultPrefix", required=true)
    private String resultPrefix;

    public String resultPrefix() {
        return this.resultPrefix;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
    private String startedOn;

    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Current state of migration
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    /**
     * Status message
     * 
     */
    @Import(name="statusMessage", required=true)
    private String statusMessage;

    public String statusMessage() {
        return this.statusMessage;
    }

    private DataItemMigrationSummaryResultResponse() {}

    private DataItemMigrationSummaryResultResponse(DataItemMigrationSummaryResultResponse $) {
        this.endedOn = $.endedOn;
        this.errorPrefix = $.errorPrefix;
        this.itemsCompletedCount = $.itemsCompletedCount;
        this.itemsCount = $.itemsCount;
        this.name = $.name;
        this.resultPrefix = $.resultPrefix;
        this.startedOn = $.startedOn;
        this.state = $.state;
        this.statusMessage = $.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataItemMigrationSummaryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataItemMigrationSummaryResultResponse $;

        public Builder() {
            $ = new DataItemMigrationSummaryResultResponse();
        }

        public Builder(DataItemMigrationSummaryResultResponse defaults) {
            $ = new DataItemMigrationSummaryResultResponse(Objects.requireNonNull(defaults));
        }

        public Builder endedOn(String endedOn) {
            $.endedOn = endedOn;
            return this;
        }

        public Builder errorPrefix(String errorPrefix) {
            $.errorPrefix = errorPrefix;
            return this;
        }

        public Builder itemsCompletedCount(Double itemsCompletedCount) {
            $.itemsCompletedCount = itemsCompletedCount;
            return this;
        }

        public Builder itemsCount(Double itemsCount) {
            $.itemsCount = itemsCount;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder resultPrefix(String resultPrefix) {
            $.resultPrefix = resultPrefix;
            return this;
        }

        public Builder startedOn(String startedOn) {
            $.startedOn = startedOn;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public Builder statusMessage(String statusMessage) {
            $.statusMessage = statusMessage;
            return this;
        }

        public DataItemMigrationSummaryResultResponse build() {
            $.endedOn = Objects.requireNonNull($.endedOn, "expected parameter 'endedOn' to be non-null");
            $.errorPrefix = Objects.requireNonNull($.errorPrefix, "expected parameter 'errorPrefix' to be non-null");
            $.itemsCompletedCount = Objects.requireNonNull($.itemsCompletedCount, "expected parameter 'itemsCompletedCount' to be non-null");
            $.itemsCount = Objects.requireNonNull($.itemsCount, "expected parameter 'itemsCount' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resultPrefix = Objects.requireNonNull($.resultPrefix, "expected parameter 'resultPrefix' to be non-null");
            $.startedOn = Objects.requireNonNull($.startedOn, "expected parameter 'startedOn' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.statusMessage = Objects.requireNonNull($.statusMessage, "expected parameter 'statusMessage' to be non-null");
            return $;
        }
    }

}
