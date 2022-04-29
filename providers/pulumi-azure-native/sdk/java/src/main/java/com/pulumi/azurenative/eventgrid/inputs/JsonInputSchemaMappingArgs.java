// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.azurenative.eventgrid.inputs.JsonFieldArgs;
import com.pulumi.azurenative.eventgrid.inputs.JsonFieldWithDefaultArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This enables publishing to Event Grid using a custom input schema. This can be used to map properties from a custom input JSON schema to the Event Grid event schema.
 * 
 */
public final class JsonInputSchemaMappingArgs extends ResourceArgs {

    public static final JsonInputSchemaMappingArgs Empty = new JsonInputSchemaMappingArgs();

    /**
     * The mapping information for the DataVersion property of the Event Grid Event.
     * 
     */
    @Import(name="dataVersion")
    private @Nullable Output<JsonFieldWithDefaultArgs> dataVersion;

    /**
     * @return The mapping information for the DataVersion property of the Event Grid Event.
     * 
     */
    public Optional<Output<JsonFieldWithDefaultArgs>> dataVersion() {
        return Optional.ofNullable(this.dataVersion);
    }

    /**
     * The mapping information for the EventTime property of the Event Grid Event.
     * 
     */
    @Import(name="eventTime")
    private @Nullable Output<JsonFieldArgs> eventTime;

    /**
     * @return The mapping information for the EventTime property of the Event Grid Event.
     * 
     */
    public Optional<Output<JsonFieldArgs>> eventTime() {
        return Optional.ofNullable(this.eventTime);
    }

    /**
     * The mapping information for the EventType property of the Event Grid Event.
     * 
     */
    @Import(name="eventType")
    private @Nullable Output<JsonFieldWithDefaultArgs> eventType;

    /**
     * @return The mapping information for the EventType property of the Event Grid Event.
     * 
     */
    public Optional<Output<JsonFieldWithDefaultArgs>> eventType() {
        return Optional.ofNullable(this.eventType);
    }

    /**
     * The mapping information for the Id property of the Event Grid Event.
     * 
     */
    @Import(name="id")
    private @Nullable Output<JsonFieldArgs> id;

    /**
     * @return The mapping information for the Id property of the Event Grid Event.
     * 
     */
    public Optional<Output<JsonFieldArgs>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Type of the custom mapping
     * Expected value is &#39;Json&#39;.
     * 
     */
    @Import(name="inputSchemaMappingType", required=true)
    private Output<String> inputSchemaMappingType;

    /**
     * @return Type of the custom mapping
     * Expected value is &#39;Json&#39;.
     * 
     */
    public Output<String> inputSchemaMappingType() {
        return this.inputSchemaMappingType;
    }

    /**
     * The mapping information for the Subject property of the Event Grid Event.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<JsonFieldWithDefaultArgs> subject;

    /**
     * @return The mapping information for the Subject property of the Event Grid Event.
     * 
     */
    public Optional<Output<JsonFieldWithDefaultArgs>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * The mapping information for the Topic property of the Event Grid Event.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<JsonFieldArgs> topic;

    /**
     * @return The mapping information for the Topic property of the Event Grid Event.
     * 
     */
    public Optional<Output<JsonFieldArgs>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private JsonInputSchemaMappingArgs() {}

    private JsonInputSchemaMappingArgs(JsonInputSchemaMappingArgs $) {
        this.dataVersion = $.dataVersion;
        this.eventTime = $.eventTime;
        this.eventType = $.eventType;
        this.id = $.id;
        this.inputSchemaMappingType = $.inputSchemaMappingType;
        this.subject = $.subject;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonInputSchemaMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonInputSchemaMappingArgs $;

        public Builder() {
            $ = new JsonInputSchemaMappingArgs();
        }

        public Builder(JsonInputSchemaMappingArgs defaults) {
            $ = new JsonInputSchemaMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataVersion The mapping information for the DataVersion property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder dataVersion(@Nullable Output<JsonFieldWithDefaultArgs> dataVersion) {
            $.dataVersion = dataVersion;
            return this;
        }

        /**
         * @param dataVersion The mapping information for the DataVersion property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder dataVersion(JsonFieldWithDefaultArgs dataVersion) {
            return dataVersion(Output.of(dataVersion));
        }

        /**
         * @param eventTime The mapping information for the EventTime property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder eventTime(@Nullable Output<JsonFieldArgs> eventTime) {
            $.eventTime = eventTime;
            return this;
        }

        /**
         * @param eventTime The mapping information for the EventTime property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder eventTime(JsonFieldArgs eventTime) {
            return eventTime(Output.of(eventTime));
        }

        /**
         * @param eventType The mapping information for the EventType property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder eventType(@Nullable Output<JsonFieldWithDefaultArgs> eventType) {
            $.eventType = eventType;
            return this;
        }

        /**
         * @param eventType The mapping information for the EventType property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder eventType(JsonFieldWithDefaultArgs eventType) {
            return eventType(Output.of(eventType));
        }

        /**
         * @param id The mapping information for the Id property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<JsonFieldArgs> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The mapping information for the Id property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder id(JsonFieldArgs id) {
            return id(Output.of(id));
        }

        /**
         * @param inputSchemaMappingType Type of the custom mapping
         * Expected value is &#39;Json&#39;.
         * 
         * @return builder
         * 
         */
        public Builder inputSchemaMappingType(Output<String> inputSchemaMappingType) {
            $.inputSchemaMappingType = inputSchemaMappingType;
            return this;
        }

        /**
         * @param inputSchemaMappingType Type of the custom mapping
         * Expected value is &#39;Json&#39;.
         * 
         * @return builder
         * 
         */
        public Builder inputSchemaMappingType(String inputSchemaMappingType) {
            return inputSchemaMappingType(Output.of(inputSchemaMappingType));
        }

        /**
         * @param subject The mapping information for the Subject property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<JsonFieldWithDefaultArgs> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject The mapping information for the Subject property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder subject(JsonFieldWithDefaultArgs subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param topic The mapping information for the Topic property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder topic(@Nullable Output<JsonFieldArgs> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The mapping information for the Topic property of the Event Grid Event.
         * 
         * @return builder
         * 
         */
        public Builder topic(JsonFieldArgs topic) {
            return topic(Output.of(topic));
        }

        public JsonInputSchemaMappingArgs build() {
            $.inputSchemaMappingType = Codegen.stringProp("inputSchemaMappingType").output().arg($.inputSchemaMappingType).require();
            return $;
        }
    }

}
