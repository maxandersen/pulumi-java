// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import com.google.gson.JsonElement;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 * 
 */
public final class ManagedFieldsEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedFieldsEntryArgs Empty = new ManagedFieldsEntryArgs();

    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
     */
    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
     */
    @InputImport(name="fieldsType")
    private final @Nullable Input<String> fieldsType;

    public Input<String> getFieldsType() {
        return this.fieldsType == null ? Input.empty() : this.fieldsType;
    }

    /**
     * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
     * 
     */
    @InputImport(name="fieldsV1")
    private final @Nullable Input<JsonElement> fieldsV1;

    public Input<JsonElement> getFieldsV1() {
        return this.fieldsV1 == null ? Input.empty() : this.fieldsV1;
    }

    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
     */
    @InputImport(name="manager")
    private final @Nullable Input<String> manager;

    public Input<String> getManager() {
        return this.manager == null ? Input.empty() : this.manager;
    }

    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
     */
    @InputImport(name="operation")
    private final @Nullable Input<String> operation;

    public Input<String> getOperation() {
        return this.operation == null ? Input.empty() : this.operation;
    }

    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
     */
    @InputImport(name="subresource")
    private final @Nullable Input<String> subresource;

    public Input<String> getSubresource() {
        return this.subresource == null ? Input.empty() : this.subresource;
    }

    /**
     * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
     * 
     */
    @InputImport(name="time")
    private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    public ManagedFieldsEntryArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> fieldsType,
        @Nullable Input<JsonElement> fieldsV1,
        @Nullable Input<String> manager,
        @Nullable Input<String> operation,
        @Nullable Input<String> subresource,
        @Nullable Input<String> time) {
        this.apiVersion = apiVersion;
        this.fieldsType = fieldsType;
        this.fieldsV1 = fieldsV1;
        this.manager = manager;
        this.operation = operation;
        this.subresource = subresource;
        this.time = time;
    }

    private ManagedFieldsEntryArgs() {
        this.apiVersion = Input.empty();
        this.fieldsType = Input.empty();
        this.fieldsV1 = Input.empty();
        this.manager = Input.empty();
        this.operation = Input.empty();
        this.subresource = Input.empty();
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedFieldsEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> fieldsType;
        private @Nullable Input<JsonElement> fieldsV1;
        private @Nullable Input<String> manager;
        private @Nullable Input<String> operation;
        private @Nullable Input<String> subresource;
        private @Nullable Input<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedFieldsEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.fieldsType = defaults.fieldsType;
    	      this.fieldsV1 = defaults.fieldsV1;
    	      this.manager = defaults.manager;
    	      this.operation = defaults.operation;
    	      this.subresource = defaults.subresource;
    	      this.time = defaults.time;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setFieldsType(@Nullable Input<String> fieldsType) {
            this.fieldsType = fieldsType;
            return this;
        }

        public Builder setFieldsType(@Nullable String fieldsType) {
            this.fieldsType = Input.ofNullable(fieldsType);
            return this;
        }

        public Builder setFieldsV1(@Nullable Input<JsonElement> fieldsV1) {
            this.fieldsV1 = fieldsV1;
            return this;
        }

        public Builder setFieldsV1(@Nullable JsonElement fieldsV1) {
            this.fieldsV1 = Input.ofNullable(fieldsV1);
            return this;
        }

        public Builder setManager(@Nullable Input<String> manager) {
            this.manager = manager;
            return this;
        }

        public Builder setManager(@Nullable String manager) {
            this.manager = Input.ofNullable(manager);
            return this;
        }

        public Builder setOperation(@Nullable Input<String> operation) {
            this.operation = operation;
            return this;
        }

        public Builder setOperation(@Nullable String operation) {
            this.operation = Input.ofNullable(operation);
            return this;
        }

        public Builder setSubresource(@Nullable Input<String> subresource) {
            this.subresource = subresource;
            return this;
        }

        public Builder setSubresource(@Nullable String subresource) {
            this.subresource = Input.ofNullable(subresource);
            return this;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }

        public ManagedFieldsEntryArgs build() {
            return new ManagedFieldsEntryArgs(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
        }
    }
}
