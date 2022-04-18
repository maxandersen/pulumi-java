// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * High-level information about a Template Spec version.
 * 
 */
public final class TemplateSpecVersionInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final TemplateSpecVersionInfoResponse Empty = new TemplateSpecVersionInfoResponse();

    /**
     * Template Spec version description.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The timestamp of when the version was created.
     * 
     */
    @Import(name="timeCreated", required=true)
      private final String timeCreated;

    public String timeCreated() {
        return this.timeCreated;
    }

    /**
     * The timestamp of when the version was last modified.
     * 
     */
    @Import(name="timeModified", required=true)
      private final String timeModified;

    public String timeModified() {
        return this.timeModified;
    }

    public TemplateSpecVersionInfoResponse(
        String description,
        String timeCreated,
        String timeModified) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.timeCreated = Objects.requireNonNull(timeCreated, "expected parameter 'timeCreated' to be non-null");
        this.timeModified = Objects.requireNonNull(timeModified, "expected parameter 'timeModified' to be non-null");
    }

    private TemplateSpecVersionInfoResponse() {
        this.description = null;
        this.timeCreated = null;
        this.timeModified = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSpecVersionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String timeCreated;
        private String timeModified;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSpecVersionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }        public TemplateSpecVersionInfoResponse build() {
            return new TemplateSpecVersionInfoResponse(description, timeCreated, timeModified);
        }
    }
}
