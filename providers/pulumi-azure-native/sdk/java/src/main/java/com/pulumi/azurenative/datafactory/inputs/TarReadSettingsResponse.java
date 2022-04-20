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
 * The Tar compression read settings.
 * 
 */
public final class TarReadSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final TarReadSettingsResponse Empty = new TarReadSettingsResponse();

    /**
     * Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="preserveCompressionFileNameAsFolder")
      private final @Nullable Object preserveCompressionFileNameAsFolder;

    public Optional<Object> preserveCompressionFileNameAsFolder() {
        return this.preserveCompressionFileNameAsFolder == null ? Optional.empty() : Optional.ofNullable(this.preserveCompressionFileNameAsFolder);
    }

    /**
     * The Compression setting type.
     * Expected value is &#39;TarReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public TarReadSettingsResponse(
        @Nullable Object preserveCompressionFileNameAsFolder,
        String type) {
        this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private TarReadSettingsResponse() {
        this.preserveCompressionFileNameAsFolder = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TarReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object preserveCompressionFileNameAsFolder;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TarReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveCompressionFileNameAsFolder = defaults.preserveCompressionFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder preserveCompressionFileNameAsFolder(@Nullable Object preserveCompressionFileNameAsFolder) {
            this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TarReadSettingsResponse build() {
            return new TarReadSettingsResponse(preserveCompressionFileNameAsFolder, type);
        }
    }
}
