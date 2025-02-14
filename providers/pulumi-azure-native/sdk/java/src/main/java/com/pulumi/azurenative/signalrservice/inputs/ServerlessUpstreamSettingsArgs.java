// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.azurenative.signalrservice.inputs.UpstreamTemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for the Upstream when the Azure SignalR is in server-less mode.
 * 
 */
public final class ServerlessUpstreamSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerlessUpstreamSettingsArgs Empty = new ServerlessUpstreamSettingsArgs();

    /**
     * Gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
     * 
     */
    @Import(name="templates")
    private @Nullable Output<List<UpstreamTemplateArgs>> templates;

    /**
     * @return Gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
     * 
     */
    public Optional<Output<List<UpstreamTemplateArgs>>> templates() {
        return Optional.ofNullable(this.templates);
    }

    private ServerlessUpstreamSettingsArgs() {}

    private ServerlessUpstreamSettingsArgs(ServerlessUpstreamSettingsArgs $) {
        this.templates = $.templates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerlessUpstreamSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerlessUpstreamSettingsArgs $;

        public Builder() {
            $ = new ServerlessUpstreamSettingsArgs();
        }

        public Builder(ServerlessUpstreamSettingsArgs defaults) {
            $ = new ServerlessUpstreamSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param templates Gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
         * 
         * @return builder
         * 
         */
        public Builder templates(@Nullable Output<List<UpstreamTemplateArgs>> templates) {
            $.templates = templates;
            return this;
        }

        /**
         * @param templates Gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
         * 
         * @return builder
         * 
         */
        public Builder templates(List<UpstreamTemplateArgs> templates) {
            return templates(Output.of(templates));
        }

        /**
         * @param templates Gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
         * 
         * @return builder
         * 
         */
        public Builder templates(UpstreamTemplateArgs... templates) {
            return templates(List.of(templates));
        }

        public ServerlessUpstreamSettingsArgs build() {
            return $;
        }
    }

}
