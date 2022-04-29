// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gallery information for a workbook template.
 * 
 */
public final class WorkbookTemplateGalleryArgs extends ResourceArgs {

    public static final WorkbookTemplateGalleryArgs Empty = new WorkbookTemplateGalleryArgs();

    /**
     * Category for the gallery.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return Category for the gallery.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Name of the workbook template in the gallery.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the workbook template in the gallery.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Order of the template within the gallery.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return Order of the template within the gallery.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Azure resource type supported by the gallery.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return Azure resource type supported by the gallery.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Type of workbook supported by the workbook template.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of workbook supported by the workbook template.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WorkbookTemplateGalleryArgs() {}

    private WorkbookTemplateGalleryArgs(WorkbookTemplateGalleryArgs $) {
        this.category = $.category;
        this.name = $.name;
        this.order = $.order;
        this.resourceType = $.resourceType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkbookTemplateGalleryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkbookTemplateGalleryArgs $;

        public Builder() {
            $ = new WorkbookTemplateGalleryArgs();
        }

        public Builder(WorkbookTemplateGalleryArgs defaults) {
            $ = new WorkbookTemplateGalleryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Category for the gallery.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Category for the gallery.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param name Name of the workbook template in the gallery.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the workbook template in the gallery.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param order Order of the template within the gallery.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order of the template within the gallery.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param resourceType Azure resource type supported by the gallery.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Azure resource type supported by the gallery.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param type Type of workbook supported by the workbook template.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of workbook supported by the workbook template.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WorkbookTemplateGalleryArgs build() {
            return $;
        }
    }

}
