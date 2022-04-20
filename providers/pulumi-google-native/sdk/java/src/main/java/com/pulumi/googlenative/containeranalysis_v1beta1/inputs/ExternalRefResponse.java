// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
 * 
 */
public final class ExternalRefResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExternalRefResponse Empty = new ExternalRefResponse();

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
     */
    @Import(name="category", required=true)
      private final String category;

    public String category() {
        return this.category;
    }

    /**
     * Human-readable information about the purpose and target of the reference
     * 
     */
    @Import(name="comment", required=true)
      private final String comment;

    public String comment() {
        return this.comment;
    }

    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
     */
    @Import(name="locator", required=true)
      private final String locator;

    public String locator() {
        return this.locator;
    }

    /**
     * Type of category (e.g. &#39;npm&#39; for the PACKAGE_MANAGER category)
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ExternalRefResponse(
        String category,
        String comment,
        String locator,
        String type) {
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.locator = Objects.requireNonNull(locator, "expected parameter 'locator' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExternalRefResponse() {
        this.category = null;
        this.comment = null;
        this.locator = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String comment;
        private String locator;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.comment = defaults.comment;
    	      this.locator = defaults.locator;
    	      this.type = defaults.type;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder locator(String locator) {
            this.locator = Objects.requireNonNull(locator);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ExternalRefResponse build() {
            return new ExternalRefResponse(category, comment, locator, type);
        }
    }
}
