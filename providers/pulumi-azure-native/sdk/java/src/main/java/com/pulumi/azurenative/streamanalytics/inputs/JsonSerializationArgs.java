// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.enums.Encoding;
import com.pulumi.azurenative.streamanalytics.enums.JsonOutputSerializationFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in JSON format.
 * 
 */
public final class JsonSerializationArgs extends ResourceArgs {

    public static final JsonSerializationArgs Empty = new JsonSerializationArgs();

    /**
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<Either<String,Encoding>> encoding;

    /**
     * @return Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<Either<String,Encoding>>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are &#39;lineSeparated&#39; indicating the output will be formatted by having each JSON object separated by a new line and &#39;array&#39; indicating the output will be formatted as an array of JSON objects. Default value is &#39;lineSeparated&#39; if left null.
     * 
     */
    @Import(name="format")
    private @Nullable Output<Either<String,JsonOutputSerializationFormat>> format;

    /**
     * @return This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are &#39;lineSeparated&#39; indicating the output will be formatted by having each JSON object separated by a new line and &#39;array&#39; indicating the output will be formatted as an array of JSON objects. Default value is &#39;lineSeparated&#39; if left null.
     * 
     */
    public Optional<Output<Either<String,JsonOutputSerializationFormat>>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Json&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Json&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private JsonSerializationArgs() {}

    private JsonSerializationArgs(JsonSerializationArgs $) {
        this.encoding = $.encoding;
        this.format = $.format;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonSerializationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonSerializationArgs $;

        public Builder() {
            $ = new JsonSerializationArgs();
        }

        public Builder(JsonSerializationArgs defaults) {
            $ = new JsonSerializationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encoding Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<Either<String,Encoding>> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder encoding(Either<String,Encoding> encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param encoding Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Either.ofLeft(encoding));
        }

        /**
         * @param encoding Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder encoding(Encoding encoding) {
            return encoding(Either.ofRight(encoding));
        }

        /**
         * @param format This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are &#39;lineSeparated&#39; indicating the output will be formatted by having each JSON object separated by a new line and &#39;array&#39; indicating the output will be formatted as an array of JSON objects. Default value is &#39;lineSeparated&#39; if left null.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<Either<String,JsonOutputSerializationFormat>> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are &#39;lineSeparated&#39; indicating the output will be formatted by having each JSON object separated by a new line and &#39;array&#39; indicating the output will be formatted as an array of JSON objects. Default value is &#39;lineSeparated&#39; if left null.
         * 
         * @return builder
         * 
         */
        public Builder format(Either<String,JsonOutputSerializationFormat> format) {
            return format(Output.of(format));
        }

        /**
         * @param format This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are &#39;lineSeparated&#39; indicating the output will be formatted by having each JSON object separated by a new line and &#39;array&#39; indicating the output will be formatted as an array of JSON objects. Default value is &#39;lineSeparated&#39; if left null.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Either.ofLeft(format));
        }

        /**
         * @param format This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are &#39;lineSeparated&#39; indicating the output will be formatted by having each JSON object separated by a new line and &#39;array&#39; indicating the output will be formatted as an array of JSON objects. Default value is &#39;lineSeparated&#39; if left null.
         * 
         * @return builder
         * 
         */
        public Builder format(JsonOutputSerializationFormat format) {
            return format(Either.ofRight(format));
        }

        /**
         * @param type Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Json&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Json&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JsonSerializationArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
