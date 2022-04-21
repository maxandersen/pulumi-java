// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.composer.inputs.GetEnvironmentConfigWorkloadsConfigScheduler;
import com.pulumi.gcp.composer.inputs.GetEnvironmentConfigWorkloadsConfigWebServer;
import com.pulumi.gcp.composer.inputs.GetEnvironmentConfigWorkloadsConfigWorker;
import java.util.List;
import java.util.Objects;


public final class GetEnvironmentConfigWorkloadsConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigWorkloadsConfig Empty = new GetEnvironmentConfigWorkloadsConfig();

    @Import(name="schedulers", required=true)
    private List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;

    public List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers() {
        return this.schedulers;
    }

    @Import(name="webServers", required=true)
    private List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;

    public List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers() {
        return this.webServers;
    }

    @Import(name="workers", required=true)
    private List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

    public List<GetEnvironmentConfigWorkloadsConfigWorker> workers() {
        return this.workers;
    }

    private GetEnvironmentConfigWorkloadsConfig() {}

    private GetEnvironmentConfigWorkloadsConfig(GetEnvironmentConfigWorkloadsConfig $) {
        this.schedulers = $.schedulers;
        this.webServers = $.webServers;
        this.workers = $.workers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentConfigWorkloadsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentConfigWorkloadsConfig $;

        public Builder() {
            $ = new GetEnvironmentConfigWorkloadsConfig();
        }

        public Builder(GetEnvironmentConfigWorkloadsConfig defaults) {
            $ = new GetEnvironmentConfigWorkloadsConfig(Objects.requireNonNull(defaults));
        }

        public Builder schedulers(List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers) {
            $.schedulers = schedulers;
            return this;
        }

        public Builder schedulers(GetEnvironmentConfigWorkloadsConfigScheduler... schedulers) {
            return schedulers(List.of(schedulers));
        }

        public Builder webServers(List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers) {
            $.webServers = webServers;
            return this;
        }

        public Builder webServers(GetEnvironmentConfigWorkloadsConfigWebServer... webServers) {
            return webServers(List.of(webServers));
        }

        public Builder workers(List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
            $.workers = workers;
            return this;
        }

        public Builder workers(GetEnvironmentConfigWorkloadsConfigWorker... workers) {
            return workers(List.of(workers));
        }

        public GetEnvironmentConfigWorkloadsConfig build() {
            $.schedulers = Objects.requireNonNull($.schedulers, "expected parameter 'schedulers' to be non-null");
            $.webServers = Objects.requireNonNull($.webServers, "expected parameter 'webServers' to be non-null");
            $.workers = Objects.requireNonNull($.workers, "expected parameter 'workers' to be non-null");
            return $;
        }
    }

}
