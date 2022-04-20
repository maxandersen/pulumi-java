// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.OutputFileResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties for an output ISO MP4 file.
 * 
 */
public final class Mp4FormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final Mp4FormatResponse Empty = new Mp4FormatResponse();

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    @Import(name="filenamePattern", required=true)
      private final String filenamePattern;

    public String filenamePattern() {
        return this.filenamePattern;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.Mp4Format&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    @Import(name="outputFiles")
      private final @Nullable List<OutputFileResponse> outputFiles;

    public List<OutputFileResponse> outputFiles() {
        return this.outputFiles == null ? List.of() : this.outputFiles;
    }

    public Mp4FormatResponse(
        String filenamePattern,
        String odataType,
        @Nullable List<OutputFileResponse> outputFiles) {
        this.filenamePattern = Objects.requireNonNull(filenamePattern, "expected parameter 'filenamePattern' to be non-null");
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
        this.outputFiles = outputFiles;
    }

    private Mp4FormatResponse() {
        this.filenamePattern = null;
        this.odataType = null;
        this.outputFiles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Mp4FormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filenamePattern;
        private String odataType;
        private @Nullable List<OutputFileResponse> outputFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(Mp4FormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filenamePattern = defaults.filenamePattern;
    	      this.odataType = defaults.odataType;
    	      this.outputFiles = defaults.outputFiles;
        }

        public Builder filenamePattern(String filenamePattern) {
            this.filenamePattern = Objects.requireNonNull(filenamePattern);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder outputFiles(@Nullable List<OutputFileResponse> outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }
        public Builder outputFiles(OutputFileResponse... outputFiles) {
            return outputFiles(List.of(outputFiles));
        }        public Mp4FormatResponse build() {
            return new Mp4FormatResponse(filenamePattern, odataType, outputFiles);
        }
    }
}
