// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Orc write settings.
 * 
 */
public final class OrcWriteSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final OrcWriteSettingsResponse Empty = new OrcWriteSettingsResponse();

    /**
     * Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileNamePrefix")
      private final @Nullable Object fileNamePrefix;

    public Optional<Object> fileNamePrefix() {
        return this.fileNamePrefix == null ? Optional.empty() : Optional.ofNullable(this.fileNamePrefix);
    }

    /**
     * Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxRowsPerFile")
      private final @Nullable Object maxRowsPerFile;

    public Optional<Object> maxRowsPerFile() {
        return this.maxRowsPerFile == null ? Optional.empty() : Optional.ofNullable(this.maxRowsPerFile);
    }

    /**
     * The write setting type.
     * Expected value is &#39;OrcWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public OrcWriteSettingsResponse(
        @Nullable Object fileNamePrefix,
        @Nullable Object maxRowsPerFile,
        String type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private OrcWriteSettingsResponse() {
        this.fileNamePrefix = null;
        this.maxRowsPerFile = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileNamePrefix;
        private @Nullable Object maxRowsPerFile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public OrcWriteSettingsResponse build() {
            return new OrcWriteSettingsResponse(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
