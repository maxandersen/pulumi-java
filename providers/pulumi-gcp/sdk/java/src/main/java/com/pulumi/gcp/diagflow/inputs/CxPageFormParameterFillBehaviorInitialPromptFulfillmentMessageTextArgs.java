// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs();

    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption")
    private @Nullable Output<Boolean> allowPlaybackInterruption;

    public Optional<Output<Boolean>> allowPlaybackInterruption() {
        return Optional.ofNullable(this.allowPlaybackInterruption);
    }

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="texts")
    private @Nullable Output<List<String>> texts;

    public Optional<Output<List<String>>> texts() {
        return Optional.ofNullable(this.texts);
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs() {}

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs $) {
        this.allowPlaybackInterruption = $.allowPlaybackInterruption;
        this.texts = $.texts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs $;

        public Builder() {
            $ = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs();
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs defaults) {
            $ = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowPlaybackInterruption(@Nullable Output<Boolean> allowPlaybackInterruption) {
            $.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            return allowPlaybackInterruption(Output.of(allowPlaybackInterruption));
        }

        public Builder texts(@Nullable Output<List<String>> texts) {
            $.texts = texts;
            return this;
        }

        public Builder texts(List<String> texts) {
            return texts(Output.of(texts));
        }

        public Builder texts(String... texts) {
            return texts(List.of(texts));
        }

        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs build() {
            return $;
        }
    }

}
