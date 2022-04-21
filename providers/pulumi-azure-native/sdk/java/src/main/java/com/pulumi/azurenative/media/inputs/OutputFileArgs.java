// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents an output file produced.
 * 
 */
public final class OutputFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputFileArgs Empty = new OutputFileArgs();

    /**
     * The list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1, then an array like &#39;[v1, a1]&#39; tells the encoder to produce an output file with the video track represented by v1 and the audio track represented by a1.
     * 
     */
    @Import(name="labels", required=true)
    private Output<List<String>> labels;

    public Output<List<String>> labels() {
        return this.labels;
    }

    private OutputFileArgs() {}

    private OutputFileArgs(OutputFileArgs $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputFileArgs $;

        public Builder() {
            $ = new OutputFileArgs();
        }

        public Builder(OutputFileArgs defaults) {
            $ = new OutputFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder labels(Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        public OutputFileArgs build() {
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            return $;
        }
    }

}
