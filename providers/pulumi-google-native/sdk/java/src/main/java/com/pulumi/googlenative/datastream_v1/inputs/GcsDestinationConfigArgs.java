// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.datastream_v1.inputs.AvroFileFormatArgs;
import com.pulumi.googlenative.datastream_v1.inputs.JsonFileFormatArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Google Cloud Storage destination configuration
 * 
 */
public final class GcsDestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcsDestinationConfigArgs Empty = new GcsDestinationConfigArgs();

    /**
     * AVRO file format configuration.
     * 
     */
    @Import(name="avroFileFormat")
      private final @Nullable Output<AvroFileFormatArgs> avroFileFormat;

    public Output<AvroFileFormatArgs> avroFileFormat() {
        return this.avroFileFormat == null ? Codegen.empty() : this.avroFileFormat;
    }

    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    @Import(name="fileRotationInterval")
      private final @Nullable Output<String> fileRotationInterval;

    public Output<String> fileRotationInterval() {
        return this.fileRotationInterval == null ? Codegen.empty() : this.fileRotationInterval;
    }

    /**
     * The maximum file size to be saved in the bucket.
     * 
     */
    @Import(name="fileRotationMb")
      private final @Nullable Output<Integer> fileRotationMb;

    public Output<Integer> fileRotationMb() {
        return this.fileRotationMb == null ? Codegen.empty() : this.fileRotationMb;
    }

    /**
     * JSON file format configuration.
     * 
     */
    @Import(name="jsonFileFormat")
      private final @Nullable Output<JsonFileFormatArgs> jsonFileFormat;

    public Output<JsonFileFormatArgs> jsonFileFormat() {
        return this.jsonFileFormat == null ? Codegen.empty() : this.jsonFileFormat;
    }

    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    public GcsDestinationConfigArgs(
        @Nullable Output<AvroFileFormatArgs> avroFileFormat,
        @Nullable Output<String> fileRotationInterval,
        @Nullable Output<Integer> fileRotationMb,
        @Nullable Output<JsonFileFormatArgs> jsonFileFormat,
        @Nullable Output<String> path) {
        this.avroFileFormat = avroFileFormat;
        this.fileRotationInterval = fileRotationInterval;
        this.fileRotationMb = fileRotationMb;
        this.jsonFileFormat = jsonFileFormat;
        this.path = path;
    }

    private GcsDestinationConfigArgs() {
        this.avroFileFormat = Codegen.empty();
        this.fileRotationInterval = Codegen.empty();
        this.fileRotationMb = Codegen.empty();
        this.jsonFileFormat = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AvroFileFormatArgs> avroFileFormat;
        private @Nullable Output<String> fileRotationInterval;
        private @Nullable Output<Integer> fileRotationMb;
        private @Nullable Output<JsonFileFormatArgs> jsonFileFormat;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDestinationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroFileFormat = defaults.avroFileFormat;
    	      this.fileRotationInterval = defaults.fileRotationInterval;
    	      this.fileRotationMb = defaults.fileRotationMb;
    	      this.jsonFileFormat = defaults.jsonFileFormat;
    	      this.path = defaults.path;
        }

        public Builder avroFileFormat(@Nullable Output<AvroFileFormatArgs> avroFileFormat) {
            this.avroFileFormat = avroFileFormat;
            return this;
        }
        public Builder avroFileFormat(@Nullable AvroFileFormatArgs avroFileFormat) {
            this.avroFileFormat = Codegen.ofNullable(avroFileFormat);
            return this;
        }
        public Builder fileRotationInterval(@Nullable Output<String> fileRotationInterval) {
            this.fileRotationInterval = fileRotationInterval;
            return this;
        }
        public Builder fileRotationInterval(@Nullable String fileRotationInterval) {
            this.fileRotationInterval = Codegen.ofNullable(fileRotationInterval);
            return this;
        }
        public Builder fileRotationMb(@Nullable Output<Integer> fileRotationMb) {
            this.fileRotationMb = fileRotationMb;
            return this;
        }
        public Builder fileRotationMb(@Nullable Integer fileRotationMb) {
            this.fileRotationMb = Codegen.ofNullable(fileRotationMb);
            return this;
        }
        public Builder jsonFileFormat(@Nullable Output<JsonFileFormatArgs> jsonFileFormat) {
            this.jsonFileFormat = jsonFileFormat;
            return this;
        }
        public Builder jsonFileFormat(@Nullable JsonFileFormatArgs jsonFileFormat) {
            this.jsonFileFormat = Codegen.ofNullable(jsonFileFormat);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }        public GcsDestinationConfigArgs build() {
            return new GcsDestinationConfigArgs(avroFileFormat, fileRotationInterval, fileRotationMb, jsonFileFormat, path);
        }
    }
}
