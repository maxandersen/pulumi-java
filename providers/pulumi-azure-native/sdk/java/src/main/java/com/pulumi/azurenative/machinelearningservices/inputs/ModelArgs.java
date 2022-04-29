// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.DatasetReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure Machine Learning Model.
 * 
 */
public final class ModelArgs extends ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The Model creation time (UTC).
     * 
     */
    @Import(name="createdTime")
    private @Nullable Output<String> createdTime;

    /**
     * @return The Model creation time (UTC).
     * 
     */
    public Optional<Output<String>> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    /**
     * The list of datasets associated with the model.
     * 
     */
    @Import(name="datasets")
    private @Nullable Output<List<DatasetReferenceArgs>> datasets;

    /**
     * @return The list of datasets associated with the model.
     * 
     */
    public Optional<Output<List<DatasetReferenceArgs>>> datasets() {
        return Optional.ofNullable(this.datasets);
    }

    /**
     * Models derived from this model
     * 
     */
    @Import(name="derivedModelIds")
    private @Nullable Output<List<String>> derivedModelIds;

    /**
     * @return Models derived from this model
     * 
     */
    public Optional<Output<List<String>>> derivedModelIds() {
        return Optional.ofNullable(this.derivedModelIds);
    }

    /**
     * The Model description text.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Model description text.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the experiment where this model was created.
     * 
     */
    @Import(name="experimentName")
    private @Nullable Output<String> experimentName;

    /**
     * @return The name of the experiment where this model was created.
     * 
     */
    public Optional<Output<String>> experimentName() {
        return Optional.ofNullable(this.experimentName);
    }

    /**
     * The Model framework.
     * 
     */
    @Import(name="framework")
    private @Nullable Output<String> framework;

    /**
     * @return The Model framework.
     * 
     */
    public Optional<Output<String>> framework() {
        return Optional.ofNullable(this.framework);
    }

    /**
     * The Model framework version.
     * 
     */
    @Import(name="frameworkVersion")
    private @Nullable Output<String> frameworkVersion;

    /**
     * @return The Model framework version.
     * 
     */
    public Optional<Output<String>> frameworkVersion() {
        return Optional.ofNullable(this.frameworkVersion);
    }

    /**
     * The Model Id.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The Model Id.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The Model tag dictionary. Items are mutable.
     * 
     */
    @Import(name="kvTags")
    private @Nullable Output<Map<String,String>> kvTags;

    /**
     * @return The Model tag dictionary. Items are mutable.
     * 
     */
    public Optional<Output<Map<String,String>>> kvTags() {
        return Optional.ofNullable(this.kvTags);
    }

    /**
     * The MIME type of Model content. For more details about MIME type, please open https://www.iana.org/assignments/media-types/media-types.xhtml
     * 
     */
    @Import(name="mimeType", required=true)
    private Output<String> mimeType;

    /**
     * @return The MIME type of Model content. For more details about MIME type, please open https://www.iana.org/assignments/media-types/media-types.xhtml
     * 
     */
    public Output<String> mimeType() {
        return this.mimeType;
    }

    /**
     * The Model last modified time (UTC).
     * 
     */
    @Import(name="modifiedTime")
    private @Nullable Output<String> modifiedTime;

    /**
     * @return The Model last modified time (UTC).
     * 
     */
    public Optional<Output<String>> modifiedTime() {
        return Optional.ofNullable(this.modifiedTime);
    }

    /**
     * The Model name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Model name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Parent Model Id.
     * 
     */
    @Import(name="parentModelId")
    private @Nullable Output<String> parentModelId;

    /**
     * @return The Parent Model Id.
     * 
     */
    public Optional<Output<String>> parentModelId() {
        return Optional.ofNullable(this.parentModelId);
    }

    /**
     * The Model property dictionary. Properties are immutable.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The Model property dictionary. Properties are immutable.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Resource requirements for the model
     * 
     */
    @Import(name="resourceRequirements")
    private @Nullable Output<ContainerResourceRequirementsArgs> resourceRequirements;

    /**
     * @return Resource requirements for the model
     * 
     */
    public Optional<Output<ContainerResourceRequirementsArgs>> resourceRequirements() {
        return Optional.ofNullable(this.resourceRequirements);
    }

    /**
     * The RunId that created this model.
     * 
     */
    @Import(name="runId")
    private @Nullable Output<String> runId;

    /**
     * @return The RunId that created this model.
     * 
     */
    public Optional<Output<String>> runId() {
        return Optional.ofNullable(this.runId);
    }

    /**
     * Sample Input Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
     * 
     */
    @Import(name="sampleInputData")
    private @Nullable Output<String> sampleInputData;

    /**
     * @return Sample Input Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
     * 
     */
    public Optional<Output<String>> sampleInputData() {
        return Optional.ofNullable(this.sampleInputData);
    }

    /**
     * Sample Output Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
     * 
     */
    @Import(name="sampleOutputData")
    private @Nullable Output<String> sampleOutputData;

    /**
     * @return Sample Output Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
     * 
     */
    public Optional<Output<String>> sampleOutputData() {
        return Optional.ofNullable(this.sampleOutputData);
    }

    /**
     * Indicates whether we need to unpack the Model during docker Image creation.
     * 
     */
    @Import(name="unpack")
    private @Nullable Output<Boolean> unpack;

    /**
     * @return Indicates whether we need to unpack the Model during docker Image creation.
     * 
     */
    public Optional<Output<Boolean>> unpack() {
        return Optional.ofNullable(this.unpack);
    }

    /**
     * The URL of the Model. Usually a SAS URL.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL of the Model. Usually a SAS URL.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * The Model version assigned by Model Management Service.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Double> version;

    /**
     * @return The Model version assigned by Model Management Service.
     * 
     */
    public Optional<Output<Double>> version() {
        return Optional.ofNullable(this.version);
    }

    private ModelArgs() {}

    private ModelArgs(ModelArgs $) {
        this.createdTime = $.createdTime;
        this.datasets = $.datasets;
        this.derivedModelIds = $.derivedModelIds;
        this.description = $.description;
        this.experimentName = $.experimentName;
        this.framework = $.framework;
        this.frameworkVersion = $.frameworkVersion;
        this.id = $.id;
        this.kvTags = $.kvTags;
        this.mimeType = $.mimeType;
        this.modifiedTime = $.modifiedTime;
        this.name = $.name;
        this.parentModelId = $.parentModelId;
        this.properties = $.properties;
        this.resourceRequirements = $.resourceRequirements;
        this.runId = $.runId;
        this.sampleInputData = $.sampleInputData;
        this.sampleOutputData = $.sampleOutputData;
        this.unpack = $.unpack;
        this.url = $.url;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelArgs $;

        public Builder() {
            $ = new ModelArgs();
        }

        public Builder(ModelArgs defaults) {
            $ = new ModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdTime The Model creation time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable Output<String> createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        /**
         * @param createdTime The Model creation time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder createdTime(String createdTime) {
            return createdTime(Output.of(createdTime));
        }

        /**
         * @param datasets The list of datasets associated with the model.
         * 
         * @return builder
         * 
         */
        public Builder datasets(@Nullable Output<List<DatasetReferenceArgs>> datasets) {
            $.datasets = datasets;
            return this;
        }

        /**
         * @param datasets The list of datasets associated with the model.
         * 
         * @return builder
         * 
         */
        public Builder datasets(List<DatasetReferenceArgs> datasets) {
            return datasets(Output.of(datasets));
        }

        /**
         * @param datasets The list of datasets associated with the model.
         * 
         * @return builder
         * 
         */
        public Builder datasets(DatasetReferenceArgs... datasets) {
            return datasets(List.of(datasets));
        }

        /**
         * @param derivedModelIds Models derived from this model
         * 
         * @return builder
         * 
         */
        public Builder derivedModelIds(@Nullable Output<List<String>> derivedModelIds) {
            $.derivedModelIds = derivedModelIds;
            return this;
        }

        /**
         * @param derivedModelIds Models derived from this model
         * 
         * @return builder
         * 
         */
        public Builder derivedModelIds(List<String> derivedModelIds) {
            return derivedModelIds(Output.of(derivedModelIds));
        }

        /**
         * @param derivedModelIds Models derived from this model
         * 
         * @return builder
         * 
         */
        public Builder derivedModelIds(String... derivedModelIds) {
            return derivedModelIds(List.of(derivedModelIds));
        }

        /**
         * @param description The Model description text.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Model description text.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param experimentName The name of the experiment where this model was created.
         * 
         * @return builder
         * 
         */
        public Builder experimentName(@Nullable Output<String> experimentName) {
            $.experimentName = experimentName;
            return this;
        }

        /**
         * @param experimentName The name of the experiment where this model was created.
         * 
         * @return builder
         * 
         */
        public Builder experimentName(String experimentName) {
            return experimentName(Output.of(experimentName));
        }

        /**
         * @param framework The Model framework.
         * 
         * @return builder
         * 
         */
        public Builder framework(@Nullable Output<String> framework) {
            $.framework = framework;
            return this;
        }

        /**
         * @param framework The Model framework.
         * 
         * @return builder
         * 
         */
        public Builder framework(String framework) {
            return framework(Output.of(framework));
        }

        /**
         * @param frameworkVersion The Model framework version.
         * 
         * @return builder
         * 
         */
        public Builder frameworkVersion(@Nullable Output<String> frameworkVersion) {
            $.frameworkVersion = frameworkVersion;
            return this;
        }

        /**
         * @param frameworkVersion The Model framework version.
         * 
         * @return builder
         * 
         */
        public Builder frameworkVersion(String frameworkVersion) {
            return frameworkVersion(Output.of(frameworkVersion));
        }

        /**
         * @param id The Model Id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The Model Id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kvTags The Model tag dictionary. Items are mutable.
         * 
         * @return builder
         * 
         */
        public Builder kvTags(@Nullable Output<Map<String,String>> kvTags) {
            $.kvTags = kvTags;
            return this;
        }

        /**
         * @param kvTags The Model tag dictionary. Items are mutable.
         * 
         * @return builder
         * 
         */
        public Builder kvTags(Map<String,String> kvTags) {
            return kvTags(Output.of(kvTags));
        }

        /**
         * @param mimeType The MIME type of Model content. For more details about MIME type, please open https://www.iana.org/assignments/media-types/media-types.xhtml
         * 
         * @return builder
         * 
         */
        public Builder mimeType(Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType The MIME type of Model content. For more details about MIME type, please open https://www.iana.org/assignments/media-types/media-types.xhtml
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        /**
         * @param modifiedTime The Model last modified time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder modifiedTime(@Nullable Output<String> modifiedTime) {
            $.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * @param modifiedTime The Model last modified time (UTC).
         * 
         * @return builder
         * 
         */
        public Builder modifiedTime(String modifiedTime) {
            return modifiedTime(Output.of(modifiedTime));
        }

        /**
         * @param name The Model name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Model name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentModelId The Parent Model Id.
         * 
         * @return builder
         * 
         */
        public Builder parentModelId(@Nullable Output<String> parentModelId) {
            $.parentModelId = parentModelId;
            return this;
        }

        /**
         * @param parentModelId The Parent Model Id.
         * 
         * @return builder
         * 
         */
        public Builder parentModelId(String parentModelId) {
            return parentModelId(Output.of(parentModelId));
        }

        /**
         * @param properties The Model property dictionary. Properties are immutable.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The Model property dictionary. Properties are immutable.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceRequirements Resource requirements for the model
         * 
         * @return builder
         * 
         */
        public Builder resourceRequirements(@Nullable Output<ContainerResourceRequirementsArgs> resourceRequirements) {
            $.resourceRequirements = resourceRequirements;
            return this;
        }

        /**
         * @param resourceRequirements Resource requirements for the model
         * 
         * @return builder
         * 
         */
        public Builder resourceRequirements(ContainerResourceRequirementsArgs resourceRequirements) {
            return resourceRequirements(Output.of(resourceRequirements));
        }

        /**
         * @param runId The RunId that created this model.
         * 
         * @return builder
         * 
         */
        public Builder runId(@Nullable Output<String> runId) {
            $.runId = runId;
            return this;
        }

        /**
         * @param runId The RunId that created this model.
         * 
         * @return builder
         * 
         */
        public Builder runId(String runId) {
            return runId(Output.of(runId));
        }

        /**
         * @param sampleInputData Sample Input Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
         * 
         * @return builder
         * 
         */
        public Builder sampleInputData(@Nullable Output<String> sampleInputData) {
            $.sampleInputData = sampleInputData;
            return this;
        }

        /**
         * @param sampleInputData Sample Input Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
         * 
         * @return builder
         * 
         */
        public Builder sampleInputData(String sampleInputData) {
            return sampleInputData(Output.of(sampleInputData));
        }

        /**
         * @param sampleOutputData Sample Output Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
         * 
         * @return builder
         * 
         */
        public Builder sampleOutputData(@Nullable Output<String> sampleOutputData) {
            $.sampleOutputData = sampleOutputData;
            return this;
        }

        /**
         * @param sampleOutputData Sample Output Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
         * 
         * @return builder
         * 
         */
        public Builder sampleOutputData(String sampleOutputData) {
            return sampleOutputData(Output.of(sampleOutputData));
        }

        /**
         * @param unpack Indicates whether we need to unpack the Model during docker Image creation.
         * 
         * @return builder
         * 
         */
        public Builder unpack(@Nullable Output<Boolean> unpack) {
            $.unpack = unpack;
            return this;
        }

        /**
         * @param unpack Indicates whether we need to unpack the Model during docker Image creation.
         * 
         * @return builder
         * 
         */
        public Builder unpack(Boolean unpack) {
            return unpack(Output.of(unpack));
        }

        /**
         * @param url The URL of the Model. Usually a SAS URL.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the Model. Usually a SAS URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param version The Model version assigned by Model Management Service.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Double> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Model version assigned by Model Management Service.
         * 
         * @return builder
         * 
         */
        public Builder version(Double version) {
            return version(Output.of(version));
        }

        public ModelArgs build() {
            $.mimeType = Objects.requireNonNull($.mimeType, "expected parameter 'mimeType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
