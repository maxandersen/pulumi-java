// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Orc write settings.
 * 
 */
public final class OrcWriteSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrcWriteSettingsArgs Empty = new OrcWriteSettingsArgs();

    /**
     * Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileNamePrefix")
      private final @Nullable Output<Object> fileNamePrefix;

    public Output<Object> fileNamePrefix() {
        return this.fileNamePrefix == null ? Codegen.empty() : this.fileNamePrefix;
    }

    /**
     * Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxRowsPerFile")
      private final @Nullable Output<Object> maxRowsPerFile;

    public Output<Object> maxRowsPerFile() {
        return this.maxRowsPerFile == null ? Codegen.empty() : this.maxRowsPerFile;
    }

    /**
     * The write setting type.
     * Expected value is &#39;OrcWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public OrcWriteSettingsArgs(
        @Nullable Output<Object> fileNamePrefix,
        @Nullable Output<Object> maxRowsPerFile,
        Output<String> type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private OrcWriteSettingsArgs() {
        this.fileNamePrefix = Codegen.empty();
        this.maxRowsPerFile = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> fileNamePrefix;
        private @Nullable Output<Object> maxRowsPerFile;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder fileNamePrefix(@Nullable Output<Object> fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = Codegen.ofNullable(fileNamePrefix);
            return this;
        }
        public Builder maxRowsPerFile(@Nullable Output<Object> maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = Codegen.ofNullable(maxRowsPerFile);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public OrcWriteSettingsArgs build() {
            return new OrcWriteSettingsArgs(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
