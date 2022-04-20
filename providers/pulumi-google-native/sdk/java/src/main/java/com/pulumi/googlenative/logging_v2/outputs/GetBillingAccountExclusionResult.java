// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBillingAccountExclusionResult {
    /**
     * The creation timestamp of the exclusion.This field may not be present for older exclusions.
     * 
     */
    private final String createTime;
    /**
     * Optional. A description of this exclusion.
     * 
     */
    private final String description;
    /**
     * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
     * 
     */
    private final Boolean disabled;
    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity&lt;ERROR sample(insertId, 0.99)
     * 
     */
    private final String filter;
    /**
     * A client-assigned identifier, such as &#34;load-balancer-exclusion&#34;. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    private final String name;
    /**
     * The last update timestamp of the exclusion.This field may not be present for older exclusions.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetBillingAccountExclusionResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.disabled = disabled;
        this.filter = filter;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * The creation timestamp of the exclusion.This field may not be present for older exclusions.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Optional. A description of this exclusion.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
     * 
    */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity&lt;ERROR sample(insertId, 0.99)
     * 
    */
    public String filter() {
        return this.filter;
    }
    /**
     * A client-assigned identifier, such as &#34;load-balancer-exclusion&#34;. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The last update timestamp of the exclusion.This field may not be present for older exclusions.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingAccountExclusionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private Boolean disabled;
        private String filter;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingAccountExclusionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetBillingAccountExclusionResult build() {
            return new GetBillingAccountExclusionResult(createTime, description, disabled, filter, name, updateTime);
        }
    }
}
