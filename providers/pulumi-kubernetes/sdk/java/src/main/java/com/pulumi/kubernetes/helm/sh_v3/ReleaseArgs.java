// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.helm.sh_v3;

import com.pulumi.asset.AssetOrArchive;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.helm.sh_v3.inputs.RepositoryOptsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReleaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReleaseArgs Empty = new ReleaseArgs();

    /**
     * If set, installation process purges chart on fail. `skipAwait` will be disabled automatically if atomic is used.
     * 
     */
    @Import(name="atomic")
      private final @Nullable Output<Boolean> atomic;

    public Output<Boolean> atomic() {
        return this.atomic == null ? Codegen.empty() : this.atomic;
    }

    /**
     * Chart name to be installed. A path may be used.
     * 
     */
    @Import(name="chart", required=true)
      private final Output<String> chart;

    public Output<String> chart() {
        return this.chart;
    }

    /**
     * Allow deletion of new resources created in this upgrade when upgrade fails.
     * 
     */
    @Import(name="cleanupOnFail")
      private final @Nullable Output<Boolean> cleanupOnFail;

    public Output<Boolean> cleanupOnFail() {
        return this.cleanupOnFail == null ? Codegen.empty() : this.cleanupOnFail;
    }

    @Import(name="compat")
      private final @Nullable Output<String> compat;

    public Output<String> compat() {
        return this.compat == null ? Codegen.empty() : this.compat;
    }

    /**
     * Create the namespace if it does not exist.
     * 
     */
    @Import(name="createNamespace")
      private final @Nullable Output<Boolean> createNamespace;

    public Output<Boolean> createNamespace() {
        return this.createNamespace == null ? Codegen.empty() : this.createNamespace;
    }

    /**
     * Run helm dependency update before installing the chart.
     * 
     */
    @Import(name="dependencyUpdate")
      private final @Nullable Output<Boolean> dependencyUpdate;

    public Output<Boolean> dependencyUpdate() {
        return this.dependencyUpdate == null ? Codegen.empty() : this.dependencyUpdate;
    }

    /**
     * Add a custom description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Use chart development versions, too. Equivalent to version &#39;&gt;0.0.0-0&#39;. If `version` is set, this is ignored.
     * 
     */
    @Import(name="devel")
      private final @Nullable Output<Boolean> devel;

    public Output<Boolean> devel() {
        return this.devel == null ? Codegen.empty() : this.devel;
    }

    /**
     * Prevent CRD hooks from, running, but run other hooks.  See helm install --no-crd-hook
     * 
     */
    @Import(name="disableCRDHooks")
      private final @Nullable Output<Boolean> disableCRDHooks;

    public Output<Boolean> disableCRDHooks() {
        return this.disableCRDHooks == null ? Codegen.empty() : this.disableCRDHooks;
    }

    /**
     * If set, the installation process will not validate rendered templates against the Kubernetes OpenAPI Schema
     * 
     */
    @Import(name="disableOpenapiValidation")
      private final @Nullable Output<Boolean> disableOpenapiValidation;

    public Output<Boolean> disableOpenapiValidation() {
        return this.disableOpenapiValidation == null ? Codegen.empty() : this.disableOpenapiValidation;
    }

    /**
     * Prevent hooks from running.
     * 
     */
    @Import(name="disableWebhooks")
      private final @Nullable Output<Boolean> disableWebhooks;

    public Output<Boolean> disableWebhooks() {
        return this.disableWebhooks == null ? Codegen.empty() : this.disableWebhooks;
    }

    /**
     * Force resource update through delete/recreate if needed.
     * 
     */
    @Import(name="forceUpdate")
      private final @Nullable Output<Boolean> forceUpdate;

    public Output<Boolean> forceUpdate() {
        return this.forceUpdate == null ? Codegen.empty() : this.forceUpdate;
    }

    /**
     * Location of public keys used for verification. Used only if `verify` is true
     * 
     */
    @Import(name="keyring")
      private final @Nullable Output<String> keyring;

    public Output<String> keyring() {
        return this.keyring == null ? Codegen.empty() : this.keyring;
    }

    /**
     * Run helm lint when planning.
     * 
     */
    @Import(name="lint")
      private final @Nullable Output<Boolean> lint;

    public Output<Boolean> lint() {
        return this.lint == null ? Codegen.empty() : this.lint;
    }

    /**
     * The rendered manifests as JSON. Not yet supported.
     * 
     */
    @Import(name="manifest")
      private final @Nullable Output<Map<String,Object>> manifest;

    public Output<Map<String,Object>> manifest() {
        return this.manifest == null ? Codegen.empty() : this.manifest;
    }

    /**
     * Limit the maximum number of revisions saved per release. Use 0 for no limit.
     * 
     */
    @Import(name="maxHistory")
      private final @Nullable Output<Integer> maxHistory;

    public Output<Integer> maxHistory() {
        return this.maxHistory == null ? Codegen.empty() : this.maxHistory;
    }

    /**
     * Release name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Namespace to install the release into.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    /**
     * Postrender command to run.
     * 
     */
    @Import(name="postrender")
      private final @Nullable Output<String> postrender;

    public Output<String> postrender() {
        return this.postrender == null ? Codegen.empty() : this.postrender;
    }

    /**
     * Perform pods restart during upgrade/rollback.
     * 
     */
    @Import(name="recreatePods")
      private final @Nullable Output<Boolean> recreatePods;

    public Output<Boolean> recreatePods() {
        return this.recreatePods == null ? Codegen.empty() : this.recreatePods;
    }

    /**
     * If set, render subchart notes along with the parent.
     * 
     */
    @Import(name="renderSubchartNotes")
      private final @Nullable Output<Boolean> renderSubchartNotes;

    public Output<Boolean> renderSubchartNotes() {
        return this.renderSubchartNotes == null ? Codegen.empty() : this.renderSubchartNotes;
    }

    /**
     * Re-use the given name, even if that name is already used. This is unsafe in production
     * 
     */
    @Import(name="replace")
      private final @Nullable Output<Boolean> replace;

    public Output<Boolean> replace() {
        return this.replace == null ? Codegen.empty() : this.replace;
    }

    /**
     * Specification defining the Helm chart repository to use.
     * 
     */
    @Import(name="repositoryOpts")
      private final @Nullable Output<RepositoryOptsArgs> repositoryOpts;

    public Output<RepositoryOptsArgs> repositoryOpts() {
        return this.repositoryOpts == null ? Codegen.empty() : this.repositoryOpts;
    }

    /**
     * When upgrading, reset the values to the ones built into the chart.
     * 
     */
    @Import(name="resetValues")
      private final @Nullable Output<Boolean> resetValues;

    public Output<Boolean> resetValues() {
        return this.resetValues == null ? Codegen.empty() : this.resetValues;
    }

    /**
     * Names of resources created by the release grouped by &#34;kind/version&#34;.
     * 
     */
    @Import(name="resourceNames")
      private final @Nullable Output<Map<String,List<String>>> resourceNames;

    public Output<Map<String,List<String>>> resourceNames() {
        return this.resourceNames == null ? Codegen.empty() : this.resourceNames;
    }

    /**
     * When upgrading, reuse the last release&#39;s values and merge in any overrides. If &#39;resetValues&#39; is specified, this is ignored
     * 
     */
    @Import(name="reuseValues")
      private final @Nullable Output<Boolean> reuseValues;

    public Output<Boolean> reuseValues() {
        return this.reuseValues == null ? Codegen.empty() : this.reuseValues;
    }

    /**
     * By default, the provider waits until all resources are in a ready state before marking the release as successful. Setting this to true will skip such await logic.
     * 
     */
    @Import(name="skipAwait")
      private final @Nullable Output<Boolean> skipAwait;

    public Output<Boolean> skipAwait() {
        return this.skipAwait == null ? Codegen.empty() : this.skipAwait;
    }

    /**
     * If set, no CRDs will be installed. By default, CRDs are installed if not already present.
     * 
     */
    @Import(name="skipCrds")
      private final @Nullable Output<Boolean> skipCrds;

    public Output<Boolean> skipCrds() {
        return this.skipCrds == null ? Codegen.empty() : this.skipCrds;
    }

    /**
     * Time in seconds to wait for any individual kubernetes operation.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * List of assets (raw yaml files). Content is read and merged with values.
     * 
     */
    @Import(name="valueYamlFiles")
      private final @Nullable Output<List<AssetOrArchive>> valueYamlFiles;

    public Output<List<AssetOrArchive>> valueYamlFiles() {
        return this.valueYamlFiles == null ? Codegen.empty() : this.valueYamlFiles;
    }

    /**
     * Custom values set for the release.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<Map<String,Object>> values;

    public Output<Map<String,Object>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    /**
     * Verify the package before installing it.
     * 
     */
    @Import(name="verify")
      private final @Nullable Output<Boolean> verify;

    public Output<Boolean> verify() {
        return this.verify == null ? Codegen.empty() : this.verify;
    }

    /**
     * Specify the exact chart version to install. If this is not specified, the latest version is installed.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    /**
     * Will wait until all Jobs have been completed before marking the release as successful. This is ignored if `skipAwait` is enabled.
     * 
     */
    @Import(name="waitForJobs")
      private final @Nullable Output<Boolean> waitForJobs;

    public Output<Boolean> waitForJobs() {
        return this.waitForJobs == null ? Codegen.empty() : this.waitForJobs;
    }

    public ReleaseArgs(
        @Nullable Output<Boolean> atomic,
        Output<String> chart,
        @Nullable Output<Boolean> cleanupOnFail,
        @Nullable Output<String> compat,
        @Nullable Output<Boolean> createNamespace,
        @Nullable Output<Boolean> dependencyUpdate,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> devel,
        @Nullable Output<Boolean> disableCRDHooks,
        @Nullable Output<Boolean> disableOpenapiValidation,
        @Nullable Output<Boolean> disableWebhooks,
        @Nullable Output<Boolean> forceUpdate,
        @Nullable Output<String> keyring,
        @Nullable Output<Boolean> lint,
        @Nullable Output<Map<String,Object>> manifest,
        @Nullable Output<Integer> maxHistory,
        @Nullable Output<String> name,
        @Nullable Output<String> namespace,
        @Nullable Output<String> postrender,
        @Nullable Output<Boolean> recreatePods,
        @Nullable Output<Boolean> renderSubchartNotes,
        @Nullable Output<Boolean> replace,
        @Nullable Output<RepositoryOptsArgs> repositoryOpts,
        @Nullable Output<Boolean> resetValues,
        @Nullable Output<Map<String,List<String>>> resourceNames,
        @Nullable Output<Boolean> reuseValues,
        @Nullable Output<Boolean> skipAwait,
        @Nullable Output<Boolean> skipCrds,
        @Nullable Output<Integer> timeout,
        @Nullable Output<List<AssetOrArchive>> valueYamlFiles,
        @Nullable Output<Map<String,Object>> values,
        @Nullable Output<Boolean> verify,
        @Nullable Output<String> version,
        @Nullable Output<Boolean> waitForJobs) {
        this.atomic = atomic;
        this.chart = Objects.requireNonNull(chart, "expected parameter 'chart' to be non-null");
        this.cleanupOnFail = cleanupOnFail;
        this.compat = Codegen.stringProp("compat").output().arg(compat).getNullable();
        this.createNamespace = createNamespace;
        this.dependencyUpdate = dependencyUpdate;
        this.description = description;
        this.devel = devel;
        this.disableCRDHooks = disableCRDHooks;
        this.disableOpenapiValidation = disableOpenapiValidation;
        this.disableWebhooks = disableWebhooks;
        this.forceUpdate = forceUpdate;
        this.keyring = keyring;
        this.lint = lint;
        this.manifest = manifest;
        this.maxHistory = maxHistory;
        this.name = name;
        this.namespace = namespace;
        this.postrender = postrender;
        this.recreatePods = recreatePods;
        this.renderSubchartNotes = renderSubchartNotes;
        this.replace = replace;
        this.repositoryOpts = repositoryOpts;
        this.resetValues = resetValues;
        this.resourceNames = resourceNames;
        this.reuseValues = reuseValues;
        this.skipAwait = skipAwait;
        this.skipCrds = skipCrds;
        this.timeout = timeout;
        this.valueYamlFiles = valueYamlFiles;
        this.values = values;
        this.verify = verify;
        this.version = version;
        this.waitForJobs = waitForJobs;
    }

    private ReleaseArgs() {
        this.atomic = Codegen.empty();
        this.chart = Codegen.empty();
        this.cleanupOnFail = Codegen.empty();
        this.compat = Codegen.empty();
        this.createNamespace = Codegen.empty();
        this.dependencyUpdate = Codegen.empty();
        this.description = Codegen.empty();
        this.devel = Codegen.empty();
        this.disableCRDHooks = Codegen.empty();
        this.disableOpenapiValidation = Codegen.empty();
        this.disableWebhooks = Codegen.empty();
        this.forceUpdate = Codegen.empty();
        this.keyring = Codegen.empty();
        this.lint = Codegen.empty();
        this.manifest = Codegen.empty();
        this.maxHistory = Codegen.empty();
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
        this.postrender = Codegen.empty();
        this.recreatePods = Codegen.empty();
        this.renderSubchartNotes = Codegen.empty();
        this.replace = Codegen.empty();
        this.repositoryOpts = Codegen.empty();
        this.resetValues = Codegen.empty();
        this.resourceNames = Codegen.empty();
        this.reuseValues = Codegen.empty();
        this.skipAwait = Codegen.empty();
        this.skipCrds = Codegen.empty();
        this.timeout = Codegen.empty();
        this.valueYamlFiles = Codegen.empty();
        this.values = Codegen.empty();
        this.verify = Codegen.empty();
        this.version = Codegen.empty();
        this.waitForJobs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> atomic;
        private Output<String> chart;
        private @Nullable Output<Boolean> cleanupOnFail;
        private @Nullable Output<String> compat;
        private @Nullable Output<Boolean> createNamespace;
        private @Nullable Output<Boolean> dependencyUpdate;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> devel;
        private @Nullable Output<Boolean> disableCRDHooks;
        private @Nullable Output<Boolean> disableOpenapiValidation;
        private @Nullable Output<Boolean> disableWebhooks;
        private @Nullable Output<Boolean> forceUpdate;
        private @Nullable Output<String> keyring;
        private @Nullable Output<Boolean> lint;
        private @Nullable Output<Map<String,Object>> manifest;
        private @Nullable Output<Integer> maxHistory;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> postrender;
        private @Nullable Output<Boolean> recreatePods;
        private @Nullable Output<Boolean> renderSubchartNotes;
        private @Nullable Output<Boolean> replace;
        private @Nullable Output<RepositoryOptsArgs> repositoryOpts;
        private @Nullable Output<Boolean> resetValues;
        private @Nullable Output<Map<String,List<String>>> resourceNames;
        private @Nullable Output<Boolean> reuseValues;
        private @Nullable Output<Boolean> skipAwait;
        private @Nullable Output<Boolean> skipCrds;
        private @Nullable Output<Integer> timeout;
        private @Nullable Output<List<AssetOrArchive>> valueYamlFiles;
        private @Nullable Output<Map<String,Object>> values;
        private @Nullable Output<Boolean> verify;
        private @Nullable Output<String> version;
        private @Nullable Output<Boolean> waitForJobs;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atomic = defaults.atomic;
    	      this.chart = defaults.chart;
    	      this.cleanupOnFail = defaults.cleanupOnFail;
    	      this.compat = defaults.compat;
    	      this.createNamespace = defaults.createNamespace;
    	      this.dependencyUpdate = defaults.dependencyUpdate;
    	      this.description = defaults.description;
    	      this.devel = defaults.devel;
    	      this.disableCRDHooks = defaults.disableCRDHooks;
    	      this.disableOpenapiValidation = defaults.disableOpenapiValidation;
    	      this.disableWebhooks = defaults.disableWebhooks;
    	      this.forceUpdate = defaults.forceUpdate;
    	      this.keyring = defaults.keyring;
    	      this.lint = defaults.lint;
    	      this.manifest = defaults.manifest;
    	      this.maxHistory = defaults.maxHistory;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.postrender = defaults.postrender;
    	      this.recreatePods = defaults.recreatePods;
    	      this.renderSubchartNotes = defaults.renderSubchartNotes;
    	      this.replace = defaults.replace;
    	      this.repositoryOpts = defaults.repositoryOpts;
    	      this.resetValues = defaults.resetValues;
    	      this.resourceNames = defaults.resourceNames;
    	      this.reuseValues = defaults.reuseValues;
    	      this.skipAwait = defaults.skipAwait;
    	      this.skipCrds = defaults.skipCrds;
    	      this.timeout = defaults.timeout;
    	      this.valueYamlFiles = defaults.valueYamlFiles;
    	      this.values = defaults.values;
    	      this.verify = defaults.verify;
    	      this.version = defaults.version;
    	      this.waitForJobs = defaults.waitForJobs;
        }

        public Builder atomic(@Nullable Output<Boolean> atomic) {
            this.atomic = atomic;
            return this;
        }
        public Builder atomic(@Nullable Boolean atomic) {
            this.atomic = Codegen.ofNullable(atomic);
            return this;
        }
        public Builder chart(Output<String> chart) {
            this.chart = Objects.requireNonNull(chart);
            return this;
        }
        public Builder chart(String chart) {
            this.chart = Output.of(Objects.requireNonNull(chart));
            return this;
        }
        public Builder cleanupOnFail(@Nullable Output<Boolean> cleanupOnFail) {
            this.cleanupOnFail = cleanupOnFail;
            return this;
        }
        public Builder cleanupOnFail(@Nullable Boolean cleanupOnFail) {
            this.cleanupOnFail = Codegen.ofNullable(cleanupOnFail);
            return this;
        }
        public Builder compat(@Nullable Output<String> compat) {
            this.compat = compat;
            return this;
        }
        public Builder compat(@Nullable String compat) {
            this.compat = Codegen.ofNullable(compat);
            return this;
        }
        public Builder createNamespace(@Nullable Output<Boolean> createNamespace) {
            this.createNamespace = createNamespace;
            return this;
        }
        public Builder createNamespace(@Nullable Boolean createNamespace) {
            this.createNamespace = Codegen.ofNullable(createNamespace);
            return this;
        }
        public Builder dependencyUpdate(@Nullable Output<Boolean> dependencyUpdate) {
            this.dependencyUpdate = dependencyUpdate;
            return this;
        }
        public Builder dependencyUpdate(@Nullable Boolean dependencyUpdate) {
            this.dependencyUpdate = Codegen.ofNullable(dependencyUpdate);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder devel(@Nullable Output<Boolean> devel) {
            this.devel = devel;
            return this;
        }
        public Builder devel(@Nullable Boolean devel) {
            this.devel = Codegen.ofNullable(devel);
            return this;
        }
        public Builder disableCRDHooks(@Nullable Output<Boolean> disableCRDHooks) {
            this.disableCRDHooks = disableCRDHooks;
            return this;
        }
        public Builder disableCRDHooks(@Nullable Boolean disableCRDHooks) {
            this.disableCRDHooks = Codegen.ofNullable(disableCRDHooks);
            return this;
        }
        public Builder disableOpenapiValidation(@Nullable Output<Boolean> disableOpenapiValidation) {
            this.disableOpenapiValidation = disableOpenapiValidation;
            return this;
        }
        public Builder disableOpenapiValidation(@Nullable Boolean disableOpenapiValidation) {
            this.disableOpenapiValidation = Codegen.ofNullable(disableOpenapiValidation);
            return this;
        }
        public Builder disableWebhooks(@Nullable Output<Boolean> disableWebhooks) {
            this.disableWebhooks = disableWebhooks;
            return this;
        }
        public Builder disableWebhooks(@Nullable Boolean disableWebhooks) {
            this.disableWebhooks = Codegen.ofNullable(disableWebhooks);
            return this;
        }
        public Builder forceUpdate(@Nullable Output<Boolean> forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }
        public Builder forceUpdate(@Nullable Boolean forceUpdate) {
            this.forceUpdate = Codegen.ofNullable(forceUpdate);
            return this;
        }
        public Builder keyring(@Nullable Output<String> keyring) {
            this.keyring = keyring;
            return this;
        }
        public Builder keyring(@Nullable String keyring) {
            this.keyring = Codegen.ofNullable(keyring);
            return this;
        }
        public Builder lint(@Nullable Output<Boolean> lint) {
            this.lint = lint;
            return this;
        }
        public Builder lint(@Nullable Boolean lint) {
            this.lint = Codegen.ofNullable(lint);
            return this;
        }
        public Builder manifest(@Nullable Output<Map<String,Object>> manifest) {
            this.manifest = manifest;
            return this;
        }
        public Builder manifest(@Nullable Map<String,Object> manifest) {
            this.manifest = Codegen.ofNullable(manifest);
            return this;
        }
        public Builder maxHistory(@Nullable Output<Integer> maxHistory) {
            this.maxHistory = maxHistory;
            return this;
        }
        public Builder maxHistory(@Nullable Integer maxHistory) {
            this.maxHistory = Codegen.ofNullable(maxHistory);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder postrender(@Nullable Output<String> postrender) {
            this.postrender = postrender;
            return this;
        }
        public Builder postrender(@Nullable String postrender) {
            this.postrender = Codegen.ofNullable(postrender);
            return this;
        }
        public Builder recreatePods(@Nullable Output<Boolean> recreatePods) {
            this.recreatePods = recreatePods;
            return this;
        }
        public Builder recreatePods(@Nullable Boolean recreatePods) {
            this.recreatePods = Codegen.ofNullable(recreatePods);
            return this;
        }
        public Builder renderSubchartNotes(@Nullable Output<Boolean> renderSubchartNotes) {
            this.renderSubchartNotes = renderSubchartNotes;
            return this;
        }
        public Builder renderSubchartNotes(@Nullable Boolean renderSubchartNotes) {
            this.renderSubchartNotes = Codegen.ofNullable(renderSubchartNotes);
            return this;
        }
        public Builder replace(@Nullable Output<Boolean> replace) {
            this.replace = replace;
            return this;
        }
        public Builder replace(@Nullable Boolean replace) {
            this.replace = Codegen.ofNullable(replace);
            return this;
        }
        public Builder repositoryOpts(@Nullable Output<RepositoryOptsArgs> repositoryOpts) {
            this.repositoryOpts = repositoryOpts;
            return this;
        }
        public Builder repositoryOpts(@Nullable RepositoryOptsArgs repositoryOpts) {
            this.repositoryOpts = Codegen.ofNullable(repositoryOpts);
            return this;
        }
        public Builder resetValues(@Nullable Output<Boolean> resetValues) {
            this.resetValues = resetValues;
            return this;
        }
        public Builder resetValues(@Nullable Boolean resetValues) {
            this.resetValues = Codegen.ofNullable(resetValues);
            return this;
        }
        public Builder resourceNames(@Nullable Output<Map<String,List<String>>> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }
        public Builder resourceNames(@Nullable Map<String,List<String>> resourceNames) {
            this.resourceNames = Codegen.ofNullable(resourceNames);
            return this;
        }
        public Builder reuseValues(@Nullable Output<Boolean> reuseValues) {
            this.reuseValues = reuseValues;
            return this;
        }
        public Builder reuseValues(@Nullable Boolean reuseValues) {
            this.reuseValues = Codegen.ofNullable(reuseValues);
            return this;
        }
        public Builder skipAwait(@Nullable Output<Boolean> skipAwait) {
            this.skipAwait = skipAwait;
            return this;
        }
        public Builder skipAwait(@Nullable Boolean skipAwait) {
            this.skipAwait = Codegen.ofNullable(skipAwait);
            return this;
        }
        public Builder skipCrds(@Nullable Output<Boolean> skipCrds) {
            this.skipCrds = skipCrds;
            return this;
        }
        public Builder skipCrds(@Nullable Boolean skipCrds) {
            this.skipCrds = Codegen.ofNullable(skipCrds);
            return this;
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder valueYamlFiles(@Nullable Output<List<AssetOrArchive>> valueYamlFiles) {
            this.valueYamlFiles = valueYamlFiles;
            return this;
        }
        public Builder valueYamlFiles(@Nullable List<AssetOrArchive> valueYamlFiles) {
            this.valueYamlFiles = Codegen.ofNullable(valueYamlFiles);
            return this;
        }
        public Builder valueYamlFiles(AssetOrArchive... valueYamlFiles) {
            return valueYamlFiles(List.of(valueYamlFiles));
        }
        public Builder values(@Nullable Output<Map<String,Object>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable Map<String,Object> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder verify(@Nullable Output<Boolean> verify) {
            this.verify = verify;
            return this;
        }
        public Builder verify(@Nullable Boolean verify) {
            this.verify = Codegen.ofNullable(verify);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }
        public Builder waitForJobs(@Nullable Output<Boolean> waitForJobs) {
            this.waitForJobs = waitForJobs;
            return this;
        }
        public Builder waitForJobs(@Nullable Boolean waitForJobs) {
            this.waitForJobs = Codegen.ofNullable(waitForJobs);
            return this;
        }        public ReleaseArgs build() {
            return new ReleaseArgs(atomic, chart, cleanupOnFail, compat, createNamespace, dependencyUpdate, description, devel, disableCRDHooks, disableOpenapiValidation, disableWebhooks, forceUpdate, keyring, lint, manifest, maxHistory, name, namespace, postrender, recreatePods, renderSubchartNotes, replace, repositoryOpts, resetValues, resourceNames, reuseValues, skipAwait, skipCrds, timeout, valueYamlFiles, values, verify, version, waitForJobs);
        }
    }
}
