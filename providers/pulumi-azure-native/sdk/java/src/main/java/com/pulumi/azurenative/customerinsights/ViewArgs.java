// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewArgs extends ResourceArgs {

    public static final ViewArgs Empty = new ViewArgs();

    /**
     * View definition.
     * 
     */
    @Import(name="definition", required=true)
    private Output<String> definition;

    /**
     * @return View definition.
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }

    /**
     * Localized display name for the view.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<Map<String,String>> displayName;

    /**
     * @return Localized display name for the view.
     * 
     */
    public Optional<Output<Map<String,String>>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * the user ID.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return the user ID.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The name of the view.
     * 
     */
    @Import(name="viewName")
    private @Nullable Output<String> viewName;

    /**
     * @return The name of the view.
     * 
     */
    public Optional<Output<String>> viewName() {
        return Optional.ofNullable(this.viewName);
    }

    private ViewArgs() {}

    private ViewArgs(ViewArgs $) {
        this.definition = $.definition;
        this.displayName = $.displayName;
        this.hubName = $.hubName;
        this.resourceGroupName = $.resourceGroupName;
        this.userId = $.userId;
        this.viewName = $.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewArgs $;

        public Builder() {
            $ = new ViewArgs();
        }

        public Builder(ViewArgs defaults) {
            $ = new ViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param definition View definition.
         * 
         * @return builder
         * 
         */
        public Builder definition(Output<String> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition View definition.
         * 
         * @return builder
         * 
         */
        public Builder definition(String definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param displayName Localized display name for the view.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Localized display name for the view.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Map<String,String> displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param userId the user ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId the user ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param viewName The name of the view.
         * 
         * @return builder
         * 
         */
        public Builder viewName(@Nullable Output<String> viewName) {
            $.viewName = viewName;
            return this;
        }

        /**
         * @param viewName The name of the view.
         * 
         * @return builder
         * 
         */
        public Builder viewName(String viewName) {
            return viewName(Output.of(viewName));
        }

        public ViewArgs build() {
            $.definition = Objects.requireNonNull($.definition, "expected parameter 'definition' to be non-null");
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
