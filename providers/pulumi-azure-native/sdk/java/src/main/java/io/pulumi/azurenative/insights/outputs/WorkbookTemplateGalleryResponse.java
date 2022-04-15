// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkbookTemplateGalleryResponse {
    /**
     * Category for the gallery.
     * 
     */
    private final @Nullable String category;
    /**
     * Name of the workbook template in the gallery.
     * 
     */
    private final @Nullable String name;
    /**
     * Order of the template within the gallery.
     * 
     */
    private final @Nullable Integer order;
    /**
     * Azure resource type supported by the gallery.
     * 
     */
    private final @Nullable String resourceType;
    /**
     * Type of workbook supported by the workbook template.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private WorkbookTemplateGalleryResponse(
        @CustomType.Parameter("category") @Nullable String category,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("order") @Nullable Integer order,
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("type") @Nullable String type) {
        this.category = category;
        this.name = name;
        this.order = order;
        this.resourceType = resourceType;
        this.type = type;
    }

    /**
     * Category for the gallery.
     * 
    */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * Name of the workbook template in the gallery.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Order of the template within the gallery.
     * 
    */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * Azure resource type supported by the gallery.
     * 
    */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * Type of workbook supported by the workbook template.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookTemplateGalleryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private @Nullable String name;
        private @Nullable Integer order;
        private @Nullable String resourceType;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookTemplateGalleryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.resourceType = defaults.resourceType;
    	      this.type = defaults.type;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public WorkbookTemplateGalleryResponse build() {
            return new WorkbookTemplateGalleryResponse(category, name, order, resourceType, type);
        }
    }
}
