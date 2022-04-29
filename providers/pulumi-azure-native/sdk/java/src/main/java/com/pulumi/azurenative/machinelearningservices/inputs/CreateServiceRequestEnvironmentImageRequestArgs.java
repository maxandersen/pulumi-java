// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.EnvironmentImageRequestEnvironmentArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.EnvironmentImageRequestEnvironmentReferenceArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ImageAssetArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Environment, models and assets needed for inferencing.
 * 
 */
public final class CreateServiceRequestEnvironmentImageRequestArgs extends ResourceArgs {

    public static final CreateServiceRequestEnvironmentImageRequestArgs Empty = new CreateServiceRequestEnvironmentImageRequestArgs();

    /**
     * The list of assets.
     * 
     */
    @Import(name="assets")
    private @Nullable Output<List<ImageAssetArgs>> assets;

    /**
     * @return The list of assets.
     * 
     */
    public Optional<Output<List<ImageAssetArgs>>> assets() {
        return Optional.ofNullable(this.assets);
    }

    /**
     * The name of the driver file.
     * 
     */
    @Import(name="driverProgram")
    private @Nullable Output<String> driverProgram;

    /**
     * @return The name of the driver file.
     * 
     */
    public Optional<Output<String>> driverProgram() {
        return Optional.ofNullable(this.driverProgram);
    }

    /**
     * The details of the AZURE ML environment.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<EnvironmentImageRequestEnvironmentArgs> environment;

    /**
     * @return The details of the AZURE ML environment.
     * 
     */
    public Optional<Output<EnvironmentImageRequestEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The unique identifying details of the AZURE ML environment.
     * 
     */
    @Import(name="environmentReference")
    private @Nullable Output<EnvironmentImageRequestEnvironmentReferenceArgs> environmentReference;

    /**
     * @return The unique identifying details of the AZURE ML environment.
     * 
     */
    public Optional<Output<EnvironmentImageRequestEnvironmentReferenceArgs>> environmentReference() {
        return Optional.ofNullable(this.environmentReference);
    }

    /**
     * The list of model Ids.
     * 
     */
    @Import(name="modelIds")
    private @Nullable Output<List<String>> modelIds;

    /**
     * @return The list of model Ids.
     * 
     */
    public Optional<Output<List<String>>> modelIds() {
        return Optional.ofNullable(this.modelIds);
    }

    /**
     * The list of models.
     * 
     */
    @Import(name="models")
    private @Nullable Output<List<ModelArgs>> models;

    /**
     * @return The list of models.
     * 
     */
    public Optional<Output<List<ModelArgs>>> models() {
        return Optional.ofNullable(this.models);
    }

    private CreateServiceRequestEnvironmentImageRequestArgs() {}

    private CreateServiceRequestEnvironmentImageRequestArgs(CreateServiceRequestEnvironmentImageRequestArgs $) {
        this.assets = $.assets;
        this.driverProgram = $.driverProgram;
        this.environment = $.environment;
        this.environmentReference = $.environmentReference;
        this.modelIds = $.modelIds;
        this.models = $.models;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateServiceRequestEnvironmentImageRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateServiceRequestEnvironmentImageRequestArgs $;

        public Builder() {
            $ = new CreateServiceRequestEnvironmentImageRequestArgs();
        }

        public Builder(CreateServiceRequestEnvironmentImageRequestArgs defaults) {
            $ = new CreateServiceRequestEnvironmentImageRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assets The list of assets.
         * 
         * @return builder
         * 
         */
        public Builder assets(@Nullable Output<List<ImageAssetArgs>> assets) {
            $.assets = assets;
            return this;
        }

        /**
         * @param assets The list of assets.
         * 
         * @return builder
         * 
         */
        public Builder assets(List<ImageAssetArgs> assets) {
            return assets(Output.of(assets));
        }

        /**
         * @param assets The list of assets.
         * 
         * @return builder
         * 
         */
        public Builder assets(ImageAssetArgs... assets) {
            return assets(List.of(assets));
        }

        /**
         * @param driverProgram The name of the driver file.
         * 
         * @return builder
         * 
         */
        public Builder driverProgram(@Nullable Output<String> driverProgram) {
            $.driverProgram = driverProgram;
            return this;
        }

        /**
         * @param driverProgram The name of the driver file.
         * 
         * @return builder
         * 
         */
        public Builder driverProgram(String driverProgram) {
            return driverProgram(Output.of(driverProgram));
        }

        /**
         * @param environment The details of the AZURE ML environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<EnvironmentImageRequestEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The details of the AZURE ML environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(EnvironmentImageRequestEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param environmentReference The unique identifying details of the AZURE ML environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentReference(@Nullable Output<EnvironmentImageRequestEnvironmentReferenceArgs> environmentReference) {
            $.environmentReference = environmentReference;
            return this;
        }

        /**
         * @param environmentReference The unique identifying details of the AZURE ML environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentReference(EnvironmentImageRequestEnvironmentReferenceArgs environmentReference) {
            return environmentReference(Output.of(environmentReference));
        }

        /**
         * @param modelIds The list of model Ids.
         * 
         * @return builder
         * 
         */
        public Builder modelIds(@Nullable Output<List<String>> modelIds) {
            $.modelIds = modelIds;
            return this;
        }

        /**
         * @param modelIds The list of model Ids.
         * 
         * @return builder
         * 
         */
        public Builder modelIds(List<String> modelIds) {
            return modelIds(Output.of(modelIds));
        }

        /**
         * @param modelIds The list of model Ids.
         * 
         * @return builder
         * 
         */
        public Builder modelIds(String... modelIds) {
            return modelIds(List.of(modelIds));
        }

        /**
         * @param models The list of models.
         * 
         * @return builder
         * 
         */
        public Builder models(@Nullable Output<List<ModelArgs>> models) {
            $.models = models;
            return this;
        }

        /**
         * @param models The list of models.
         * 
         * @return builder
         * 
         */
        public Builder models(List<ModelArgs> models) {
            return models(Output.of(models));
        }

        /**
         * @param models The list of models.
         * 
         * @return builder
         * 
         */
        public Builder models(ModelArgs... models) {
            return models(List.of(models));
        }

        public CreateServiceRequestEnvironmentImageRequestArgs build() {
            return $;
        }
    }

}
