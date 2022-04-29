// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.TarGZipReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.TarReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.ZipDeflateReadSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Delimited text read settings.
 * 
 */
public final class DelimitedTextReadSettingsArgs extends ResourceArgs {

    public static final DelimitedTextReadSettingsArgs Empty = new DelimitedTextReadSettingsArgs();

    /**
     * Compression settings.
     * 
     */
    @Import(name="compressionProperties")
    private @Nullable Output<Object> compressionProperties;

    /**
     * @return Compression settings.
     * 
     */
    public Optional<Output<Object>> compressionProperties() {
        return Optional.ofNullable(this.compressionProperties);
    }

    /**
     * Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="skipLineCount")
    private @Nullable Output<Object> skipLineCount;

    /**
     * @return Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> skipLineCount() {
        return Optional.ofNullable(this.skipLineCount);
    }

    /**
     * The read setting type.
     * Expected value is &#39;DelimitedTextReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The read setting type.
     * Expected value is &#39;DelimitedTextReadSettings&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DelimitedTextReadSettingsArgs() {}

    private DelimitedTextReadSettingsArgs(DelimitedTextReadSettingsArgs $) {
        this.compressionProperties = $.compressionProperties;
        this.skipLineCount = $.skipLineCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DelimitedTextReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DelimitedTextReadSettingsArgs $;

        public Builder() {
            $ = new DelimitedTextReadSettingsArgs();
        }

        public Builder(DelimitedTextReadSettingsArgs defaults) {
            $ = new DelimitedTextReadSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compressionProperties Compression settings.
         * 
         * @return builder
         * 
         */
        public Builder compressionProperties(@Nullable Output<Object> compressionProperties) {
            $.compressionProperties = compressionProperties;
            return this;
        }

        /**
         * @param compressionProperties Compression settings.
         * 
         * @return builder
         * 
         */
        public Builder compressionProperties(Object compressionProperties) {
            return compressionProperties(Output.of(compressionProperties));
        }

        /**
         * @param skipLineCount Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipLineCount(@Nullable Output<Object> skipLineCount) {
            $.skipLineCount = skipLineCount;
            return this;
        }

        /**
         * @param skipLineCount Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipLineCount(Object skipLineCount) {
            return skipLineCount(Output.of(skipLineCount));
        }

        /**
         * @param type The read setting type.
         * Expected value is &#39;DelimitedTextReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The read setting type.
         * Expected value is &#39;DelimitedTextReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DelimitedTextReadSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
