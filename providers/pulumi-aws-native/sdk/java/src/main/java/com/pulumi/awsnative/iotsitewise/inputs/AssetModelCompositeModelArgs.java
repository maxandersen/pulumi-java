// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.awsnative.iotsitewise.inputs.AssetModelPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a composite model definition in an asset model. This composite model definition is applied to all assets created from the asset model.
 * 
 */
public final class AssetModelCompositeModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetModelCompositeModelArgs Empty = new AssetModelCompositeModelArgs();

    /**
     * The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    @Import(name="compositeModelProperties")
    private @Nullable Output<List<AssetModelPropertyArgs>> compositeModelProperties;

    /**
     * @return The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    public Optional<Output<List<AssetModelPropertyArgs>>> compositeModelProperties() {
        return Optional.ofNullable(this.compositeModelProperties);
    }

    /**
     * A description for the asset composite model.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the asset composite model.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A unique, friendly name for the asset composite model.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A unique, friendly name for the asset composite model.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AssetModelCompositeModelArgs() {}

    private AssetModelCompositeModelArgs(AssetModelCompositeModelArgs $) {
        this.compositeModelProperties = $.compositeModelProperties;
        this.description = $.description;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetModelCompositeModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelCompositeModelArgs $;

        public Builder() {
            $ = new AssetModelCompositeModelArgs();
        }

        public Builder(AssetModelCompositeModelArgs defaults) {
            $ = new AssetModelCompositeModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compositeModelProperties The property definitions of the asset model. You can specify up to 200 properties per asset model.
         * 
         * @return builder
         * 
         */
        public Builder compositeModelProperties(@Nullable Output<List<AssetModelPropertyArgs>> compositeModelProperties) {
            $.compositeModelProperties = compositeModelProperties;
            return this;
        }

        /**
         * @param compositeModelProperties The property definitions of the asset model. You can specify up to 200 properties per asset model.
         * 
         * @return builder
         * 
         */
        public Builder compositeModelProperties(List<AssetModelPropertyArgs> compositeModelProperties) {
            return compositeModelProperties(Output.of(compositeModelProperties));
        }

        /**
         * @param compositeModelProperties The property definitions of the asset model. You can specify up to 200 properties per asset model.
         * 
         * @return builder
         * 
         */
        public Builder compositeModelProperties(AssetModelPropertyArgs... compositeModelProperties) {
            return compositeModelProperties(List.of(compositeModelProperties));
        }

        /**
         * @param description A description for the asset composite model.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the asset composite model.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name A unique, friendly name for the asset composite model.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique, friendly name for the asset composite model.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the composite model. For alarm composite models, this type is AWS/ALARM
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the composite model. For alarm composite models, this type is AWS/ALARM
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AssetModelCompositeModelArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
