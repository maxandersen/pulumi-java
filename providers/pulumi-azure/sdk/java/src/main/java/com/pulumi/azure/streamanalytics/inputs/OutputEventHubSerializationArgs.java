// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputEventHubSerializationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputEventHubSerializationArgs Empty = new OutputEventHubSerializationArgs();

    /**
     * The encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. It currently can only be set to `UTF8`.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return The encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. It currently can only be set to `UTF8`.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The delimiter that will be used to separate comma-separated value (CSV) records. Possible values are ` ` (space), `,` (comma), `   ` (tab), `|` (pipe) and `;`.
     * 
     */
    @Import(name="fieldDelimiter")
    private @Nullable Output<String> fieldDelimiter;

    /**
     * @return The delimiter that will be used to separate comma-separated value (CSV) records. Possible values are ` ` (space), `,` (comma), `   ` (tab), `|` (pipe) and `;`.
     * 
     */
    public Optional<Output<String>> fieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }

    /**
     * Specifies the format of the JSON the output will be written in. Possible values are `Array` and `LineSeparated`.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Specifies the format of the JSON the output will be written in. Possible values are `Array` and `LineSeparated`.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The serialization format used for outgoing data streams. Possible values are `Avro`, `Csv` and `Json`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The serialization format used for outgoing data streams. Possible values are `Avro`, `Csv` and `Json`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private OutputEventHubSerializationArgs() {}

    private OutputEventHubSerializationArgs(OutputEventHubSerializationArgs $) {
        this.encoding = $.encoding;
        this.fieldDelimiter = $.fieldDelimiter;
        this.format = $.format;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputEventHubSerializationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputEventHubSerializationArgs $;

        public Builder() {
            $ = new OutputEventHubSerializationArgs();
        }

        public Builder(OutputEventHubSerializationArgs defaults) {
            $ = new OutputEventHubSerializationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encoding The encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. It currently can only be set to `UTF8`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding The encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. It currently can only be set to `UTF8`.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param fieldDelimiter The delimiter that will be used to separate comma-separated value (CSV) records. Possible values are ` ` (space), `,` (comma), `   ` (tab), `|` (pipe) and `;`.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            $.fieldDelimiter = fieldDelimiter;
            return this;
        }

        /**
         * @param fieldDelimiter The delimiter that will be used to separate comma-separated value (CSV) records. Possible values are ` ` (space), `,` (comma), `   ` (tab), `|` (pipe) and `;`.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            return fieldDelimiter(Output.of(fieldDelimiter));
        }

        /**
         * @param format Specifies the format of the JSON the output will be written in. Possible values are `Array` and `LineSeparated`.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Specifies the format of the JSON the output will be written in. Possible values are `Array` and `LineSeparated`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param type The serialization format used for outgoing data streams. Possible values are `Avro`, `Csv` and `Json`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The serialization format used for outgoing data streams. Possible values are `Avro`, `Csv` and `Json`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OutputEventHubSerializationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
