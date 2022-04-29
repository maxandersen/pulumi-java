// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AudioTrackDescriptorArgs;
import com.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeArgs;
import com.pulumi.azurenative.media.inputs.SelectAudioTrackByIdArgs;
import com.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeArgs;
import com.pulumi.azurenative.media.inputs.SelectVideoTrackByIdArgs;
import com.pulumi.azurenative.media.inputs.VideoTrackDescriptorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An InputDefinition for a single file.  TrackSelections are scoped to the file specified.
 * 
 */
public final class InputFileArgs extends ResourceArgs {

    public static final InputFileArgs Empty = new InputFileArgs();

    /**
     * Name of the file that this input definition applies to.
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return Name of the file that this input definition applies to.
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @Import(name="includedTracks")
    private @Nullable Output<List<Object>> includedTracks;

    /**
     * @return The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    public Optional<Output<List<Object>>> includedTracks() {
        return Optional.ofNullable(this.includedTracks);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.InputFile&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.InputFile&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private InputFileArgs() {}

    private InputFileArgs(InputFileArgs $) {
        this.filename = $.filename;
        this.includedTracks = $.includedTracks;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InputFileArgs $;

        public Builder() {
            $ = new InputFileArgs();
        }

        public Builder(InputFileArgs defaults) {
            $ = new InputFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filename Name of the file that this input definition applies to.
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename Name of the file that this input definition applies to.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        /**
         * @param includedTracks The list of TrackDescriptors which define the metadata and selection of tracks in the input.
         * 
         * @return builder
         * 
         */
        public Builder includedTracks(@Nullable Output<List<Object>> includedTracks) {
            $.includedTracks = includedTracks;
            return this;
        }

        /**
         * @param includedTracks The list of TrackDescriptors which define the metadata and selection of tracks in the input.
         * 
         * @return builder
         * 
         */
        public Builder includedTracks(List<Object> includedTracks) {
            return includedTracks(Output.of(includedTracks));
        }

        /**
         * @param includedTracks The list of TrackDescriptors which define the metadata and selection of tracks in the input.
         * 
         * @return builder
         * 
         */
        public Builder includedTracks(Object... includedTracks) {
            return includedTracks(List.of(includedTracks));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.InputFile&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.InputFile&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public InputFileArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
