// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Status of the date policy
 * 
 */
public final class CloudTieringDatePolicyStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudTieringDatePolicyStatusResponse Empty = new CloudTieringDatePolicyStatusResponse();

    /**
     * Last updated timestamp
     * 
     */
    @Import(name="lastUpdatedTimestamp", required=true)
    private String lastUpdatedTimestamp;

    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Most recent access time of tiered files
     * 
     */
    @Import(name="tieredFilesMostRecentAccessTimestamp", required=true)
    private String tieredFilesMostRecentAccessTimestamp;

    public String tieredFilesMostRecentAccessTimestamp() {
        return this.tieredFilesMostRecentAccessTimestamp;
    }

    private CloudTieringDatePolicyStatusResponse() {}

    private CloudTieringDatePolicyStatusResponse(CloudTieringDatePolicyStatusResponse $) {
        this.lastUpdatedTimestamp = $.lastUpdatedTimestamp;
        this.tieredFilesMostRecentAccessTimestamp = $.tieredFilesMostRecentAccessTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudTieringDatePolicyStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudTieringDatePolicyStatusResponse $;

        public Builder() {
            $ = new CloudTieringDatePolicyStatusResponse();
        }

        public Builder(CloudTieringDatePolicyStatusResponse defaults) {
            $ = new CloudTieringDatePolicyStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            $.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }

        public Builder tieredFilesMostRecentAccessTimestamp(String tieredFilesMostRecentAccessTimestamp) {
            $.tieredFilesMostRecentAccessTimestamp = tieredFilesMostRecentAccessTimestamp;
            return this;
        }

        public CloudTieringDatePolicyStatusResponse build() {
            $.lastUpdatedTimestamp = Objects.requireNonNull($.lastUpdatedTimestamp, "expected parameter 'lastUpdatedTimestamp' to be non-null");
            $.tieredFilesMostRecentAccessTimestamp = Objects.requireNonNull($.tieredFilesMostRecentAccessTimestamp, "expected parameter 'tieredFilesMostRecentAccessTimestamp' to be non-null");
            return $;
        }
    }

}
